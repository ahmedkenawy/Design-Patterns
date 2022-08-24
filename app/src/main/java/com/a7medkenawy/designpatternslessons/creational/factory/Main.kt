package com.a7medkenawy.designpatternslessons.creational.factory

fun main(){
    val productA=Factory().createProduct("ProductA")
    val productB=Factory().createProduct("ProductB")
    val productC=Factory().createProduct("ProductC")
    val productD=Factory().createProduct("ProductD")
}