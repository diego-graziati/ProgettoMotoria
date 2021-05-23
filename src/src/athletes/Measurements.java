package src.athletes;

import java.util.Date;
import java.util.LinkedList;

//This class stores all the athlete's data
public class Measurements {
    public LinkedList<String> testTypology;
    public LinkedList<String> date;
    public LinkedList<Integer> hour;
    public LinkedList<String> impulse;
    public LinkedList<String> leftRight;
    public LinkedList<Double> flyTime;
    public LinkedList<Double> contTime;
    public LinkedList<Double> height;
    public LinkedList<Double> rhythm;
    public LinkedList<Integer> steps;
    public LinkedList<Double> speed;
    public LinkedList<Double> acceleration;
    public LinkedList<Integer> distance;
    public LinkedList<Integer> lope; //falcata
    public LinkedList<Double> stanceTime;
    public LinkedList<Double> stanceTimePerc;
    public LinkedList<Double> contactPhase;
    public LinkedList<Double> contactPhasePerc;
    public LinkedList<Double> footFlat;
    public LinkedList<Double> footFlatPerc;
    public LinkedList<Double> propulsivePhase;
    public LinkedList<Double> propulsivePhasePerc;
    public LinkedList<Double> contactTimePerc;
    public LinkedList<String> note;

    //setters
    public void setTestTypology(LinkedList<String> testTypology) {
        this.testTypology = testTypology;
    }

    public void setDate(LinkedList<String> date) {
        this.date = date;
    }

    public void setImpulse(LinkedList<String> impulse) {
        this.impulse = impulse;
    }

    public void setLeftRight(LinkedList<String> leftRight) {
        this.leftRight = leftRight;
    }

    public void setFlyTime(LinkedList<Double> flyTime) {
        this.flyTime = flyTime;
    }

    public void setContTime(LinkedList<Double> contTime) {
        this.contTime = contTime;
    }

    public void setHeight(LinkedList<Double> height) {
        this.height = height;
    }

    public void setSteps(LinkedList<Integer> steps) {
        this.steps = steps;
    }

    public void setSpeed(LinkedList<Double> speed) {
        this.speed = speed;
    }

    public void setAcceleration(LinkedList<Double> acceleration) {
        this.acceleration = acceleration;
    }

    public void setDistance(LinkedList<Integer> distance) {
        this.distance = distance;
    }

    public void setLope(LinkedList<Integer> lope) {
        this.lope = lope;
    }

    public void setStanceTime(LinkedList<Double> stanceTime) {
        this.stanceTime = stanceTime;
    }

    public void setStanceTimePerc(LinkedList<Double> stanceTimePerc) {
        this.stanceTimePerc = stanceTimePerc;
    }

    public void setContactPhase(LinkedList<Double> contactPhase) {
        this.contactPhase = contactPhase;
    }

    public void setContactPhasePerc(LinkedList<Double> contactPhasePerc) {
        this.contactPhasePerc = contactPhasePerc;
    }

    public void setFootFlat(LinkedList<Double> footFlat) {
        this.footFlat = footFlat;
    }

    public void setFootFlatPerc(LinkedList<Double> footFlatPerc) {
        this.footFlatPerc = footFlatPerc;
    }

    public void setPropulsivePhase(LinkedList<Double> propulsivePhase) {
        this.propulsivePhase = propulsivePhase;
    }

    public void setPropulsivePhasePerc(LinkedList<Double> propulsivePhasePerc) {
        this.propulsivePhasePerc = propulsivePhasePerc;
    }

    public void setContactTimePerc(LinkedList<Double> contactTimePerc) {
        this.contactTimePerc = contactTimePerc;
    }

    public void setNote(LinkedList<String> note) {
        this.note = note;
    }

    public void setHour(LinkedList<Integer> hour) {
        this.hour = hour;
    }

    public void setRhythm(LinkedList<Double> rhythm) {
        this.rhythm = rhythm;
    }

    //getters
    public LinkedList<String> getTestTypology() {
        return testTypology;
    }

    public LinkedList<String> getDate() {
        return date;
    }

    public LinkedList<String> getImpulse() {
        return impulse;
    }

    public LinkedList<String> getLeftRight() {
        return leftRight;
    }

    public LinkedList<Double> getFlyTime() {
        return flyTime;
    }

    public LinkedList<Double> getContTime() {
        return contTime;
    }

    public LinkedList<Double> getHeight() {
        return height;
    }

    public LinkedList<Integer> getSteps() {
        return steps;
    }

    public LinkedList<Double> getSpeed() {
        return speed;
    }

    public LinkedList<Double> getAcceleration() {
        return acceleration;
    }

    public LinkedList<Integer> getDistance() {
        return distance;
    }

    public LinkedList<Integer> getLope() {
        return lope;
    }

    public LinkedList<Double> getStanceTime() {
        return stanceTime;
    }

    public LinkedList<Double> getStanceTimePerc() {
        return stanceTimePerc;
    }

    public LinkedList<Double> getContactPhase() {
        return contactPhase;
    }

    public LinkedList<Double> getContactPhasePerc() {
        return contactPhasePerc;
    }

    public LinkedList<Double> getFootFlat() {
        return footFlat;
    }

    public LinkedList<Double> getFootFlatPerc() {
        return footFlatPerc;
    }

    public LinkedList<Double> getPropulsivePhase() {
        return propulsivePhase;
    }

    public LinkedList<Double> getPropulsivePhasePerc() {
        return propulsivePhasePerc;
    }

    public LinkedList<Double> getContactTimePerc() {
        return contactTimePerc;
    }

    public LinkedList<String> getNote() {
        return note;
    }

    public LinkedList<Integer> getHour() {
        return hour;
    }

    public LinkedList<Double> getRhythm() {
        return rhythm;
    }
}
