package entities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 


public class Post {
    private LocalDate moment;
    private String title;
    private String content;
    private int likes;
    private List<Coment> coments = new ArrayList<>();

    public Post(){
    }
    
    public Post(LocalDate moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDate getMoment() {
        return moment;
    }
    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public List<Coment> getComents() {
        return coments;
    }

    public void addComent(Coment coment) {
        coments.add(coment);
    }

    public void removeComent(Coment coment){
        coments.remove(coment);
    }

    @Override
    public String toString() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Usada para concatenar com maior eficiência
        StringBuilder sb = new StringBuilder();
        String comentarios = coments.stream().map(Coment::toString).collect(Collectors.joining("\n"));
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(moment.format(format));
        sb.append(content);
        sb.append("\nComments:\n");
        sb.append(comentarios);

        return  sb.toString();

    }
}