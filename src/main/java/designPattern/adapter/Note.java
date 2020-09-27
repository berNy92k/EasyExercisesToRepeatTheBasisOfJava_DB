package designPattern.adapter;

import java.util.Date;

public class Note {
    private String title;
    private String description;
    private Date creationDate;

    private Note() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Note(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
        this.creationDate = builder.creationDate;
    }

    public static class Builder {
        private String title;
        private String description;
        private Date creationDate;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setCreationDate(Date creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Note build() {
            return new Note(this);
        }
    }

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
