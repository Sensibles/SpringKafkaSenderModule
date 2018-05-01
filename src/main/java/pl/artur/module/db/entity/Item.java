package pl.artur.module.db.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	
	long id;
	String itemName;
	int amount;

	 @JsonCreator
	 Item( @JsonProperty("itemName") String itemName,
			 @JsonProperty("amount")int amount) {
		this.itemName = itemName;
		this.amount = amount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
