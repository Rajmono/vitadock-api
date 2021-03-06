package com.medisanaspace.model;

import com.medisanaspace.library.RandomHelper;
import com.medisanaspace.model.base.BaseModel;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Targetscale extends BaseModel {

	public static final int MIN_BODY_WEIGHT = 75;

	public static final int MAX_BODY_WEIGHT = 85;

	public static final int MIN_BODY_FAT = 20;

	public static final int MAX_BODY_FAT = 25;

	public static final int MIN_BMI = 0;

	public static final int MAX_BMI = 100;

	public static final int MIN_MUSCLE_MASS = 0;

	public static final int MAX_MUSCLE_MASS = 100;

	public static final int MIN_BONE_MASS = 0;

	public static final int MAX_BONE_MASS = 100;

	public static final int MIN_BODY_WATER = 0;

	public static final int MAX_BODY_WATER = 100;

	public static final int MIN_KCAL = 0;

	public static final int MAX_KCAL = 9999;

	public static final int MIN_TARGET_WEIGHT = 0;

	public static final int MAX_TARGET_WEIGHT = 300;

	public static final int MIN_ATHLETIC = 0;

	public static final int MAX_ATHLETIC = 1;

	private Float bodyWeight;
	private Float bodyFat;
	private Float bmi;
	private Float muscleMass;
	private Float boneMass;
	private Float bodyWater;
	private Integer kcal;
	private Float targetWeight;
	private Integer athletic;
	private String moduleSerialId;

	public static Targetscale generateRandomEntry() {
		final Targetscale targetscale = new Targetscale();
		targetscale.setBodyWeight(RandomHelper.generateFloat(MIN_BODY_WEIGHT,
				MAX_BODY_WEIGHT));
		targetscale.setBodyFat(RandomHelper.generateFloat(MIN_BODY_FAT,
				MAX_BODY_FAT));
		targetscale.setBmi(RandomHelper.generateFloat(MIN_BMI, MAX_BMI));
		targetscale.setMuscleMass(RandomHelper.generateFloat(MIN_MUSCLE_MASS,
				MAX_MUSCLE_MASS));
		targetscale.setBodyWater(RandomHelper.generateFloat(MIN_BODY_WATER,
				MAX_BODY_WATER));
		targetscale.setKcal(RandomHelper.generateInt(MIN_KCAL, MAX_KCAL));
		targetscale.setTargetWeight(RandomHelper.generateFloat(
				MIN_TARGET_WEIGHT, MAX_TARGET_WEIGHT));
		targetscale.setAthletic(RandomHelper.generateInt(MIN_ATHLETIC,
				MAX_ATHLETIC));
		targetscale.setMealStatus(RandomHelper.generateInt(MIN_MEAL_STATUS,
				MAX_MEAL_STATUS));
		targetscale.setActivityStatus(RandomHelper.generateInt(
				MIN_ACTIVITY_STATUS, MAX_ACTIVITY_STATUS));
		targetscale.setMood(RandomHelper.generateInt(MIN_MOOD, MAX_MOOD));
		targetscale.setNote("[Autogenerated item]");
		targetscale.setModuleSerialId("[Autogenerated item]");
		return targetscale;
	}

	public final String toJson() {
		return new JSONSerializer().exclude("*.class").serialize(this);
	}

	public static final Targetscale fromJsonToTargetscale(final String json) {
		return new JSONDeserializer<Targetscale>().use(null, Targetscale.class)
				.deserialize(json);
	}

	public static final String toJsonArray(
			final Collection<Targetscale> collection) {
		return new JSONSerializer().exclude("*.class").exclude("active")
				.exclude("updatedDate").exclude("version")
				.serialize(collection);
	}

	public static final Collection<Targetscale> fromJsonArrayToTargetscales(
			final String json) {
		return new JSONDeserializer<List<Targetscale>>()
				.use(null, ArrayList.class).use("values", Targetscale.class)
				.deserialize(json);
	}

	public final String getModuleSerialId() {
		return this.moduleSerialId;
	}

	public void setModuleSerialId(final String moduleSerialId) {
		this.moduleSerialId = moduleSerialId;
	}

	public final Float getBodyWeight() {
		return this.bodyWeight;
	}

	public void setBodyWeight(final Float bodyWeight) {
		this.bodyWeight = bodyWeight;
	}

	public final Float getBodyFat() {
		return this.bodyFat;
	}

	public void setBodyFat(final Float bodyFat) {
		this.bodyFat = bodyFat;
	}

	public final Float getBmi() {
		return this.bmi;
	}

	public void setBmi(final Float bmi) {
		this.bmi = bmi;
	}

	public final Float getMuscleMass() {
		return this.muscleMass;
	}

	public void setMuscleMass(final Float muscleMass) {
		this.muscleMass = muscleMass;
	}

	public final Float getBoneMass() {
		return this.boneMass;
	}

	public void setBoneMass(final Float boneMass) {
		this.boneMass = boneMass;
	}

	public final Float getBodyWater() {
		return this.bodyWater;
	}

	public void setBodyWater(final Float bodyWater) {
		this.bodyWater = bodyWater;
	}

	public final Integer getKcal() {
		return this.kcal;
	}

	public void setKcal(final Integer kcal) {
		this.kcal = kcal;
	}

	public final Float getTargetWeight() {
		return this.targetWeight;
	}

	public void setTargetWeight(final Float targetWeight) {
		this.targetWeight = targetWeight;
	}

	public final Integer getAthletic() {
		return this.athletic;
	}

	public void setAthletic(final Integer athletic) {
		this.athletic = athletic;
	}
}
