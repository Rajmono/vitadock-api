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
public class Thermodock extends BaseModelWithoutMeal {

	public static final int MIN_BODY_TEMPERATURE = 38;

	public static final int MAX_BODY_TEMPERATURE = 39;

	public static final int MIN_BODY_TEMPERATURE_TARGET_MIN = 34;

	public static final int MAX_BODY_TEMPERATURE_TARGET_MIN = 42;

	public static final int MIN_BODY_TEMPERATURE_TARGET_MAX = 34;

	public static final int MAX_BODY_TEMPERATURE_TARGET_MAX = 42;

	private Float bodyTemperature;
	private Float bodyTemperatureTargetMin;
	private Float bodyTemperatureTargetMax;
	private String moduleSerialId;

	/**
	 * Method generateRandomEntry.
	 * @return Thermodock
	 */
	public static final Thermodock generateRandomEntry() {
		final Thermodock thermodock = new Thermodock();
		thermodock.setBodyTemperature(RandomHelper.generateFloat(
				MIN_BODY_TEMPERATURE, MAX_BODY_TEMPERATURE));
		thermodock.setBodyTemperatureTargetMin(RandomHelper.generateFloat(
				MIN_BODY_TEMPERATURE_TARGET_MIN,
				MAX_BODY_TEMPERATURE_TARGET_MIN));
		thermodock.setBodyTemperatureTargetMax(RandomHelper.generateFloat(
				MIN_BODY_TEMPERATURE_TARGET_MAX,
				MAX_BODY_TEMPERATURE_TARGET_MAX));
		thermodock.setActivityStatus(RandomHelper.generateInt(
				MIN_ACTIVITY_STATUS, MAX_ACTIVITY_STATUS));
		thermodock.setMood(RandomHelper.generateInt(MIN_MOOD, MAX_MOOD));
		thermodock.setNote("[Autogenerated item]");
		thermodock.setModuleSerialId("[Autogenerated item]");
		return thermodock;
	}

	/**
	 * Method getBodyTemperature.
	 * @return Float
	 */
	public Float getBodyTemperature() {
		return this.bodyTemperature;
	}

	/**
	 * Method setBodyTemperature.
	 * @param bodyTemperature Float
	 */
	public void setBodyTemperature(final Float bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}

	/**
	 * Method getBodyTemperatureTargetMin.
	 * @return Float
	 */
	public final Float getBodyTemperatureTargetMin() {
		return this.bodyTemperatureTargetMin;
	}

	/**
	 * Method setBodyTemperatureTargetMin.
	 * @param bodyTemperatureTargetMin Float
	 */
	public void setBodyTemperatureTargetMin(final Float bodyTemperatureTargetMin) {
		this.bodyTemperatureTargetMin = bodyTemperatureTargetMin;
	}

	/**
	 * Method getBodyTemperatureTargetMax.
	 * @return Float
	 */
	public final Float getBodyTemperatureTargetMax() {
		return this.bodyTemperatureTargetMax;
	}

	/**
	 * Method setBodyTemperatureTargetMax.
	 * @param bodyTemperatureTargetMax Float
	 */
	public void setBodyTemperatureTargetMax(final Float bodyTemperatureTargetMax) {
		this.bodyTemperatureTargetMax = bodyTemperatureTargetMax;
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
	
	
	
	/**
	 * Method toJson.
	 * @return String
	 */
	public final String toJson() {
		return new JSONSerializer().exclude("*.class").serialize(this);
	}

	/**
	 * Method fromJsonToThermodock.
	 * @param json String
	 * @return Thermodock
	 */
	public static final Thermodock fromJsonToThermodock(final String json) {
		return new JSONDeserializer<Thermodock>().use(null, Thermodock.class)
				.deserialize(json);
	}

	/**
	 * Method toJsonArray.
	 * @param collection Collection<Thermodock>
	 * @return String
	 */
	public static final String toJsonArray(
			final Collection<Thermodock> collection) {
		return new JSONSerializer().exclude("*.class").exclude("active")
				.exclude("updatedDate").exclude("version").exclude("id")
				.serialize(collection);
	}

	/**
	 * Method fromJsonArrayToThermodocks.
	 * @param json String
	 * @return Collection<Thermodock>
	 */
	public static final Collection<Thermodock> fromJsonArrayToThermodocks(
			final String json) {
		return new JSONDeserializer<List<Thermodock>>()
				.use(null, ArrayList.class).use("values", Thermodock.class)
				.deserialize(json);
	}
}