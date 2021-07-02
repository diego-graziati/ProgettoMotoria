package graziatiDiego.athletes;

import java.util.LinkedList;

//This class stores all the athlete's data
public class Measurements {
    public LinkedList<String> testTypology = new LinkedList<>();
    public LinkedList<String> date = new LinkedList<>();
    public LinkedList<String> hour = new LinkedList<>();
    public LinkedList<String> impulse = new LinkedList<>();
    public LinkedList<String> leftRight = new LinkedList<>();
    public LinkedList<Double> flyTime = new LinkedList<>();
    public LinkedList<Double> contTime = new LinkedList<>();
    public LinkedList<Double> height = new LinkedList<>();
    public LinkedList<Double> rhythm = new LinkedList<>();
    public LinkedList<Integer> steps = new LinkedList<>();
    public LinkedList<Double> speed = new LinkedList<>();
    public LinkedList<Double> acceleration = new LinkedList<>();
    public LinkedList<Integer> distance = new LinkedList<>();
    public LinkedList<Integer> lope = new LinkedList<>(); //falcata
    public LinkedList<Double> stanceTime = new LinkedList<>();
    public LinkedList<Double> stanceTimePerc = new LinkedList<>();
    public LinkedList<Double> contactPhase = new LinkedList<>();
    public LinkedList<Double> contactPhasePerc = new LinkedList<>();
    public LinkedList<Double> footFlat = new LinkedList<>();
    public LinkedList<Double> footFlatPerc = new LinkedList<>();
    public LinkedList<Double> propulsivePhase = new LinkedList<>();
    public LinkedList<Double> propulsivePhasePerc = new LinkedList<>();
    public LinkedList<Double> contactTimePerc = new LinkedList<>();
    public LinkedList<String> note = new LinkedList<>();

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

    public LinkedList<Double> getRhythm() {
        return rhythm;
    }
}
