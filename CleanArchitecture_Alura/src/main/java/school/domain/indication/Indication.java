package school.domain.indication;

import java.time.LocalDateTime;

public class Indication {

    private String indicated;
    private String indicator;
    private LocalDateTime indicationDate;


    public Indication(String indicated, String indicator) {
        this.indicated = indicated;
        this.indicator = indicator;
        this.indicationDate = LocalDateTime.now();
    }

    public String getIndicated() {
        return indicated;
    }
    public void setIndicated(String indicated) {
        this.indicated = indicated;
    }
    public String getIndicator() {
        return indicator;
    }
    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }
    public LocalDateTime getIndicationDate() {
        return indicationDate;
    }
    public void setIndicationDate(LocalDateTime indicationDate) {
        this.indicationDate = indicationDate;
    }
}
