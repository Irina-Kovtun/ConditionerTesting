//на всякий случай класс Conditioner
// package ru.netology.domain;
//
//public class Conditioner {
//    String name;
//    int maxTemperature;
//    int minTemperature;
//    int currentTemperature;
//    boolean on;
//}

package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature = 30;
    private int minTemperature = 10;
    private int currentTemperature = (maxTemperature + minTemperature) / 2;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getMaxTemperature() {

        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {

        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {

        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {

        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {

        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
//        альтернативный вариант кода для данного метода:
//        if(currentTemperature <= maxTemperature) {
//            if(currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return;
        }
        currentTemperature++;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return;
        }
        currentTemperature--;
      }

    public boolean isOn() {

        return on;
    }

    public void setOn(boolean on) {

        this.on = on;
    }
}
