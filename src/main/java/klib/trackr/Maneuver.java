package klib.trackr;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "position", "instruction", "travelTime", "length", "id", "_type" })
public class Maneuver {

	@JsonProperty("position")
	private Position position;
	@JsonProperty("instruction")
	private String instruction;
	@JsonProperty("travelTime")
	private Integer travelTime;
	@JsonProperty("length")
	private Integer length;
	@JsonProperty("id")
	private String id;
	@JsonProperty("_type")
	private String type;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("position")
	public Position getPosition() {
		return position;
	}

	@JsonProperty("position")
	public void setPosition(Position position) {
		this.position = position;
	}

	@JsonProperty("instruction")
	public String getInstruction() {
		return instruction;
	}

	@JsonProperty("instruction")
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	@JsonProperty("travelTime")
	public Integer getTravelTime() {
		return travelTime;
	}

	@JsonProperty("travelTime")
	public void setTravelTime(Integer travelTime) {
		this.travelTime = travelTime;
	}

	@JsonProperty("length")
	public Integer getLength() {
		return length;
	}

	@JsonProperty("length")
	public void setLength(Integer length) {
		this.length = length;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("_type")
	public String getType() {
		return type;
	}

	@JsonProperty("_type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return id.toString() + " " + length.toString();
	}
}
