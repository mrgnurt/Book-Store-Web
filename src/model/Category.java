package model;

/**
 * Created by mrgnu on 28/04/2017.
 */
public class Category {

    private int id;
    private String categoryDescription;

    public Category(int id, String categoryDescription) {
        this.id = id;
        this.categoryDescription = categoryDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}
