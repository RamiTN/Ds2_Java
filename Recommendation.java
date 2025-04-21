package org.example.Model.Recommendation;
import java.util.Date;

    public class Recommendation {
        private int id;
        private String type; // "course", "feedback", "ressource", etc.
        private int cibleId; // ID of the person (etudiant/admin) who gets the recommendation
        private String contenu; // The actual recommended content (title, short desc, etc.)
        private String source; // Optional: why it was recommended or where it came from
        private Date date; // When it was generated

        // 🔹 Constructors
        public Recommendation() {}

        public Recommendation(int id, String type, int cibleId, String contenu, String source, Date date) {
            this.id = id;
            this.type = type;
            this.cibleId = cibleId;
            this.contenu = contenu;
            this.source = source;
            this.date = date;
        }

        // 🔹 Getters & Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getCibleId() {
            return cibleId;
        }

        public void setCibleId(int cibleId) {
            this.cibleId = cibleId;
        }

        public String getContenu() {
            return contenu;
        }

        public void setContenu(String contenu) {
            this.contenu = contenu;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        // 🔹 Optional: toString
        @Override
        public String toString() {
            return "Recommendation{" +
                    "id=" + id +
                    ", type='" + type + '\'' +
                    ", cibleId=" + cibleId +
                    ", contenu='" + contenu + '\'' +
                    ", source='" + source + '\'' +
                    ", date=" + date +
                    '}';
        }
    }
