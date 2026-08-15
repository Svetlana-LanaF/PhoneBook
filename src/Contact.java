import java.util.ArrayList;
import java.util.List;

public final class Contact {
    //поля класса
    private final String fullName;
    private final String phoneNumber;
    private final String email;
    private final List<String> tags; //Список тегов(изменяемый)

    public Contact(String fullName, String phoneNumber, String email, List<String> tags){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.tags = copyTags(tags);
    }

    public String getFullName(){
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getTags(){
        return copyTags(this.tags);
    }

    private List<String> copyTags(List<String> original){
        return new ArrayList<>(original);
    }

    public Contact withPhoneNumber(String phoneNumber){
        return new Contact(this.getFullName(), phoneNumber, this.getEmail(), this.getTags());
    }

    public Contact withAddTags(String newTag){
        List<String> newTags = copyTags(this.tags);
        newTags.add(newTag);
        return new Contact(this.getFullName(),this.getPhoneNumber(), this.getEmail(), newTags);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", tags=" + tags +
                '}';
    }
}