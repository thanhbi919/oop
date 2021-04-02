package hust.soict.hedspi.digitalvideodisc;

import hust.soict.hedspi.aims.media.Media;

public class DigitalVideoDisc extends Media {
    private int length;
    private String directory;

    public DigitalVideoDisc() {
    }

    public DigitalVideoDisc(int length, String directory) {
        this.length = length;
        this.directory = directory;
    }

    public DigitalVideoDisc(String title, String category, float cost, int length, String directory) {
        super(title, category, cost);
        this.length = length;
        this.directory = directory;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean search(String title) {
        String splitTitle[];
        String test[] = this.title.split(" ");
        splitTitle = title.split(" ");
        int count = 0;
        for (String x : test) {
            for (String y : splitTitle) {
                if (x.equalsIgnoreCase(y) == true) {
                    count++;
                    break;
                }
            }
        }
        if (count == test.length) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "DigitalVideoDisc{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                ", length=" + length +
                ", directory='" + directory + '\'' +
                '}';
    }
}
