package kg.geektech.hwgetfilm.ui;


import com.google.gson.annotations.SerializedName;


public class Films {


    private long idRoom;

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("description")
    private String description;

    @SerializedName("director")
    private String producer;

    public Films() {
    }

    public Films(String title, String producer) {
        this.producer = producer;
        this.title = title;
    }


    public String getProducer() {
        return producer;
    }

    public long getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(long idRoom) {
        this.idRoom = idRoom;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

}