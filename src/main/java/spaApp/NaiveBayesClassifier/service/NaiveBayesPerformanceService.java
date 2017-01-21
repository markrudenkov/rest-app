package spaApp.NaiveBayesClassifier.service;

import net.sf.javaml.classification.Classifier;
import net.sf.javaml.classification.bayes.NaiveBayesClassifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spaApp.Classifier.model.*;
import spaApp.Classifier.service.ClassifierService;
import spaApp.rates.model.Instrument.Instrument;
import spaApp.rates.service.RateService;

@Service
public class NaiveBayesPerformanceService extends ClassifierService {

    @Autowired
    RateService rateService;

    Classifier naiveBayesClassifier = new NaiveBayesClassifier(true, true, false);

    public Analysis getAnalysis (Instrument instrument){
        Analysis forecast = new Analysis();
        forecast.setAccuraccy(String.valueOf(getAveragePerformance(4, instrument.getSymbol().toString(),naiveBayesClassifier, true )));
        forecast.setSymbol(instrument.getSymbol());
        return forecast;
    }

}
