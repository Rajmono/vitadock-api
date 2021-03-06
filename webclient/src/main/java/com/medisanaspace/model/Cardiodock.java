package com.medisanaspace.model;

import com.medisanaspace.library.RandomHelper;
import com.medisanaspace.model.base.BaseModelWithoutMeal;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 */
public class Cardiodock extends BaseModelWithoutMeal {

	public static final int MIN_SYSTOLE = 90;

	public static final int MAX_SYSTOLE = 140;

	public static final int MIN_DIASTOLE = 60;

	public static final int MAX_DIASTOLE = 100;

	public static final int MIN_PULSE = 70;

	public static final int MAX_PULSE = 150;

	public static final int MIN_SYSTOLE_TARGET_MIN = 90;

	public static final int MAX_SYSTOLE_TARGET_MIN = 120;

	public static final int MIN_SYSTOLE_TARGET_MAX = 0;

	public static final int MAX_SYSTOLE_TARGET_MAX = 300;

	public static final int MIN_DIASTOLE_TARGET_MIN = 60;

	public static final int MAX_DIASTOLE_TARGET_MIN = 80;

	public static final int MIN_DIASTOLE_TARGET_MAX = 0;

	public static final int MAX_DIASTOLE_TARGET_MAX = 300;

	public static final int MIN_PULSE_TARGET_MIN = 60;

	public static final int MAX_PULSE_TARGET_MIN = 90;

	public static final int MIN_PULSE_TARGET_MAX = 40;

	public static final int MAX_PULSE_TARGET_MAX = 200;

	public static final int MIN_TYPE = 0;

	public static final int MAX_TYPE = 1;

	public static final int MIN_ARRHYTHMIC = 0;

	public static final int MAX_ARRHYTHMIC = 1;

	private Integer systole;
	private Integer diastole;
	private Integer pulse;
	private Integer systoleTargetMin;
	private Integer systoleTargetMax;
	private Integer diastoleTargetMin;
	private Integer diastoleTargetMax;
	private Integer pulseTargetMin;
	private Integer pulseTargetMax;
	private Integer type;
	private Integer arrhythmic;
	private String moduleSerialId;

	/**
	 * Method generateRandomEntry.
	 * @return Cardiodock
	 */
	public static final Cardiodock generateRandomEntry() {
		final Cardiodock cardiodock = new Cardiodock();
		cardiodock.setSystoleTargetMin(RandomHelper.generateInt(
				MIN_SYSTOLE_TARGET_MIN, MAX_SYSTOLE_TARGET_MIN));
		cardiodock.setSystoleTargetMax(RandomHelper.generateInt(
				MIN_SYSTOLE_TARGET_MAX, MAX_SYSTOLE_TARGET_MAX));
		cardiodock.setDiastoleTargetMin(RandomHelper.generateInt(
				MIN_DIASTOLE_TARGET_MIN, MAX_DIASTOLE_TARGET_MIN));
		cardiodock.setDiastoleTargetMax(RandomHelper.generateInt(
				MIN_DIASTOLE_TARGET_MAX, MAX_DIASTOLE_TARGET_MAX));
		cardiodock.setPulseTargetMin(RandomHelper.generateInt(
				MIN_PULSE_TARGET_MIN, MAX_PULSE_TARGET_MIN));
		cardiodock.setPulseTargetMax(RandomHelper.generateInt(
				MIN_PULSE_TARGET_MAX, MAX_PULSE_TARGET_MAX));
		cardiodock.setActivityStatus(RandomHelper.generateInt(
				MIN_ACTIVITY_STATUS, MAX_ACTIVITY_STATUS));
		cardiodock.setMood(RandomHelper.generateInt(MIN_MOOD, MAX_MOOD));
		cardiodock.setNote("[Autogenerated item]");
		cardiodock.setSystole(RandomHelper
				.generateInt(MIN_SYSTOLE, MAX_SYSTOLE));
		cardiodock.setDiastole(RandomHelper.generateInt(MIN_DIASTOLE,
				MAX_DIASTOLE));
		cardiodock.setPulse(RandomHelper.generateInt(MIN_PULSE, MAX_PULSE));
		cardiodock.setModuleSerialId("[Autogenerated item]");
		cardiodock.setType(RandomHelper.generateInt(MIN_TYPE, MAX_TYPE));
		cardiodock.setArrhythmic(RandomHelper.generateInt(MIN_ARRHYTHMIC,
				MAX_ARRHYTHMIC));
		return cardiodock;
	}

	/**
	 * Method toJson.
	 * @return String
	 */
	public final String toJson() {
		return new JSONSerializer().exclude("*.class").serialize(this);
	}

	/**
	 * Method fromJsonToCardiodock.
	 * @param json String
	 * @return Cardiodock
	 */
	public static final Cardiodock fromJsonToCardiodock(final String json) {
		return new JSONDeserializer<Cardiodock>().use(null, Cardiodock.class)
				.deserialize(json);
	}

	/**
	 * Method toJsonArray.
	 * @param collection Collection<Cardiodock>
	 * @return String
	 */
	public static final String toJsonArray(
			final Collection<Cardiodock> collection) {
		return new JSONSerializer().exclude("*.class").exclude("active")
				.exclude("updatedDate").exclude("version").exclude("id")
				.serialize(collection);
	}

	/**
	 * Method fromJsonArrayToCardiodocks.
	 * @param json String
	 * @return Collection<Cardiodock>
	 */
	public static final Collection<Cardiodock> fromJsonArrayToCardiodocks(
			final String json) {
		return new JSONDeserializer<List<Cardiodock>>()
				.use(null, ArrayList.class).use("values", Cardiodock.class)
				.deserialize(json);
	}

	/**
	 * Method getSystole.
	 * @return Integer
	 */
	public final Integer getSystole() {
		return this.systole;
	}

	/**
	 * Method setSystole.
	 * @param systole Integer
	 */
	public void setSystole(final Integer systole) {
		this.systole = systole;
	}

	/**
	 * Method getDiastole.
	 * @return Integer
	 */
	public final Integer getDiastole() {
		return this.diastole;
	}

	/**
	 * Method setDiastole.
	 * @param diastole Integer
	 */
	public void setDiastole(final Integer diastole) {
		this.diastole = diastole;
	}

	/**
	 * Method getPulse.
	 * @return Integer
	 */
	public final Integer getPulse() {
		return this.pulse;
	}

	/**
	 * Method setPulse.
	 * @param pulse Integer
	 */
	public void setPulse(final Integer pulse) {
		this.pulse = pulse;
	}

	/**
	 * Method getSystoleTargetMin.
	 * @return Integer
	 */
	public final Integer getSystoleTargetMin() {
		return this.systoleTargetMin;
	}

	/**
	 * Method setSystoleTargetMin.
	 * @param systoleTargetMin Integer
	 */
	public void setSystoleTargetMin(final Integer systoleTargetMin) {
		this.systoleTargetMin = systoleTargetMin;
	}

	/**
	 * Method getSystoleTargetMax.
	 * @return Integer
	 */
	public final Integer getSystoleTargetMax() {
		return this.systoleTargetMax;
	}

	/**
	 * Method setSystoleTargetMax.
	 * @param systoleTargetMax Integer
	 */
	public void setSystoleTargetMax(final Integer systoleTargetMax) {
		this.systoleTargetMax = systoleTargetMax;
	}

	/**
	 * Method getDiastoleTargetMin.
	 * @return Integer
	 */
	public final Integer getDiastoleTargetMin() {
		return this.diastoleTargetMin;
	}

	/**
	 * Method setDiastoleTargetMin.
	 * @param diastoleTargetMin Integer
	 */
	public void setDiastoleTargetMin(final Integer diastoleTargetMin) {
		this.diastoleTargetMin = diastoleTargetMin;
	}

	/**
	 * Method getDiastoleTargetMax.
	 * @return Integer
	 */
	public final Integer getDiastoleTargetMax() {
		return this.diastoleTargetMax;
	}

	/**
	 * Method setDiastoleTargetMax.
	 * @param diastoleTargetMax Integer
	 */
	public void setDiastoleTargetMax(final Integer diastoleTargetMax) {
		this.diastoleTargetMax = diastoleTargetMax;
	}

	/**
	 * Method getPulseTargetMin.
	 * @return Integer
	 */
	public final Integer getPulseTargetMin() {
		return this.pulseTargetMin;
	}

	/**
	 * Method setPulseTargetMin.
	 * @param pulseTargetMin Integer
	 */
	public void setPulseTargetMin(final Integer pulseTargetMin) {
		this.pulseTargetMin = pulseTargetMin;
	}

	/**
	 * Method getPulseTargetMax.
	 * @return Integer
	 */
	public final Integer getPulseTargetMax() {
		return this.pulseTargetMax;
	}

	/**
	 * Method setPulseTargetMax.
	 * @param pulseTargetMax Integer
	 */
	public void setPulseTargetMax(final Integer pulseTargetMax) {
		this.pulseTargetMax = pulseTargetMax;
	}

	/**
	 * Method getType.
	 * @return Integer
	 */
	public final Integer getType() {
		return this.type;
	}

	/**
	 * Method setType.
	 * @param type Integer
	 */
	public void setType(final Integer type) {
		this.type = type;
	}

	/**
	 * Method getArrhythmic.
	 * @return Integer
	 */
	public final Integer getArrhythmic() {
		return this.arrhythmic;
	}

	/**
	 * Method setArrhythmic.
	 * @param arrhythmic Integer
	 */
	public void setArrhythmic(final Integer arrhythmic) {
		this.arrhythmic = arrhythmic;
	}

	/**
	 * Method getModuleSerialId.
	 * @return String
	 */
	public final String getModuleSerialId() {
		return this.moduleSerialId;
	}

	/**
	 * Method setModuleSerialId.
	 * @param moduleSerialId String
	 */
	public void setModuleSerialId(final String moduleSerialId) {
		this.moduleSerialId = moduleSerialId;
	}
}
