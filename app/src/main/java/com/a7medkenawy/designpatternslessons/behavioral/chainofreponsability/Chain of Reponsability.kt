package com.a7medkenawy.designpatternslessons.behavioral.chainofreponsability

abstract class Handler {
    var successor: Handler? = null

    @JvmName("setSuccessor1")
    fun setSuccessor(successor: Handler) {
        this.successor = successor
    }

    abstract fun approveRequest(request: Request)
}

data class Request(val requestType: RequestType, val amount: Int)

enum class RequestType {
    CONFERENCE,
    PURCHASE
}

class Director : Handler() {
    override fun approveRequest(request: Request) {
        if (request.requestType == RequestType.CONFERENCE) {
            println("Director Approved the Request")
        } else {
            successor!!.approveRequest(request)
        }
    }

}

class VP : Handler() {
    override fun approveRequest(request: Request) {
        if (request.requestType == RequestType.PURCHASE) {
            if (request.amount < 1500) {
                println("VP Approved the Request")
            }
        } else {
            successor!!.approveRequest(request)
        }
    }
}

class CEO : Handler() {
    override fun approveRequest(request: Request) {
        println("CEO Approved the Request")
    }

}

fun main() {
    val ahmed = Director()
    val aly = VP()
    val hassan = CEO()

    ahmed.setSuccessor(aly)
    aly.setSuccessor(hassan)

    ahmed.approveRequest(Request(RequestType.CONFERENCE, 1600))
    ahmed.approveRequest(Request(RequestType.PURCHASE, 200))
    ahmed.approveRequest(Request(RequestType.PURCHASE, 15000))
}
