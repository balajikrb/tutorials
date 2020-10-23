package com.balaji.tutorials;

@SuppressWarnings("preview")
public sealed class Car extends Vehicle permits Audi, Jaquar, Mercedes{

}