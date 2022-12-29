import java.awt.Color;

public class Main {
    public static void main(String[] args) {

    }
}

/**
 * тип автомобиля
 */
enum TypeCar {SEDAN, PICKUP}

/**
 * вид используемого топлива
 */
enum TypeFuel {GASOLINE, DIESEL, ELECTRICITY}

/**
 * тип трансмиссии
 */
enum TypeGearBox {MT, AT}

/**
 * родительский класс типового автомобиля
 */
abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearBoxType;
    private double engineCapacity;

    Car() {
    }

    /**
     * задать скоорость движения
     */
    public void movement() {
    }

    /**
     * техническое состояние, ТО
     */
    public void maintenance() {
    }

    /**
     * переключние передач
     */
    public boolean gearShifting() {
        return true;
    }

    /**
     * работа (переключение) фар
     */
    public boolean switchHeadLights() {
        return true;
    }

    /**
     * работа (переключение) дворников
     */
    public boolean switchHipers() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGearBox getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(TypeGearBox gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}

/**
 * интерфейс работы АЗС
 */
interface iRefueling {

    /**
     * заправка топливом
     */
    void fuel();
}

/**
 * интерфейс мойки (протирания) деталей
 */
interface iWipe {

    /**
     * протереть лобовое стекло
     */
    void wipWindshield();

    /**
     * протереть фары
     */
    void wipHeadlights();

    /**
     * протереть зеркала
     */
    void wipMirror();
}

/**
 * класс уборочной машины
 */
class SweepCar extends Car {

    /**
     * реализация механизма уборки
     */
    public void sweeping() {
    }
}

/**
 * класс пикапа
 */
class PickUp extends Car implements iRefueling, iWipe {

    /**
     * грузоподъемность пикапа
     */
    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirror() {

    }
}

/**
 * класс машины будущего
 */
class FutureCar extends Car {
    //FutureCar(){this.setNumberWheels(3);}

    /**
     * функция осущестления полёта авто
     */
    private void fly() {
    }
}

/**
 * автомобиль с бензиновым двигателем
 */
class GasolineCar extends Car implements iRefueling {

    GasolineCar() {
        this.setFuelType(TypeFuel.GASOLINE);
    }

    /**
     * заправка бензином
     */
    @Override
    public void fuel() {

    }
}

/**
 * автомобиль с дизельным двигателем
 */
class DieselCar extends Car implements iRefueling {

    DieselCar() {
        this.setFuelType(TypeFuel.DIESEL);
    }

    /**
     * заправка дизелем
     */
    @Override
    public void fuel() {

    }
}