package spaApp.classifier.model;


public class Forecast {

    String forecastedBar;
    String symbol;
    String accuraccy;

    public String getForecastedBar() {
        return forecastedBar;
    }

    public void setForecastedBar(String forecastedBar) {
        this.forecastedBar = forecastedBar;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setAccuraccy(String accuraccy) {
        this.accuraccy = accuraccy;
    }

    public String getAccuraccy() {
        return accuraccy;
    }
}
