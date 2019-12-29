package cn.itbaizhan.health.vo;

public class Sick {
	private double bpHigh;
	private double bpLow;
	private double bs;
	private boolean historyHypertension;
	private boolean historyFamilyHypertension;
	private boolean historySmoking;
	private int exerciseGroup;
	private int ageGroup;

	public double getBpHigh() {
		return bpHigh;
	}

	public void setBpHigh(double bpHigh) {
		this.bpHigh = bpHigh;
	}

	public double getBpLow() {
		return bpLow;
	}

	public void setBpLow(double bpLow) {
		this.bpLow = bpLow;
	}

	public double getBs() {
		return bs;
	}

	public void setBs(double bs) {
		this.bs = bs;
	}

	public boolean isHistoryHypertension() {
		return historyHypertension;
	}

	public void setHistoryHypertension(boolean historyHypertension) {
		this.historyHypertension = historyHypertension;
	}

	public boolean isHistoryFamilyHypertension() {
		return historyFamilyHypertension;
	}

	public void setHistoryFamilyHypertension(boolean historyFamilyHypertension) {
		this.historyFamilyHypertension = historyFamilyHypertension;
	}

	public boolean isHistorySmoking() {
		return historySmoking;
	}

	public void setHistorySmoking(boolean historySmoking) {
		this.historySmoking = historySmoking;
	}

	public int getExerciseGroup() {
		return exerciseGroup;
	}

	public void setExerciseGroup(int exerciseGroup) {
		this.exerciseGroup = exerciseGroup;
	}

	public int getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(int ageGroup) {
		this.ageGroup = ageGroup;
	}
}
