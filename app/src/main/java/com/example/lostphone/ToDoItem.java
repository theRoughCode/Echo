package com.example.lostphone;

/**
 * Represents an item in a ToDo list
 */
public class ToDoItem {

    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("uid")
    private String UID;

    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    /**
     * GPS Location
     */
    @com.google.gson.annotations.SerializedName("gps")
    private String GPS;

    /**
     * Indicates if the item is completed
     */
    @com.google.gson.annotations.SerializedName("complete")
    private boolean mComplete;

    /**
     * ToDoItem constructor
     */
    public ToDoItem() {

    }

    @Override
    public String toString() {
        return getText();
    }

    /**
     * Initializes a new ToDoItem
     *
     * @param uid
     *            The item UID
     * @param gps
     *            The item GPS
     * @param id
     *            The item id
     */
    public ToDoItem(String uid, String gps, String id) {
        this.setUID(uid);
        this.setGPS(gps);
        this.setId(id);
    }

    /**
     * Returns the item text
     */
    public String getText() {
        return (UID + ";" + GPS);
    }

    /**
     * Returns the item text
     */
    public String getGPS() { return GPS; }

    /**
     * Returns the item text
     */
    public String getUID() {
        return UID;
    }

    /**
     * Sets the item text
     *
     * @param uid
     *            text to set
     */
    public final void setUID(String uid) {
        UID = uid;
    }

    /**
     * Sets the item text
     *
     * @param gps
     *            text to set
     */
    public final void setGPS(String gps) {
        GPS = gps;
    }

    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
    }

    /**
     * Indicates if the item is marked as completed
     */
    public boolean isComplete() {
        return mComplete;
    }

    /**
     * Marks the item as completed or incompleted
     */
    public void setComplete(boolean complete) {
        mComplete = complete;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ToDoItem && ((ToDoItem) o).mId == mId;
    }
}