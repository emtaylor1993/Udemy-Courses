/**
 * MAGAZINE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Magazine object.
 * 
 * @packages
 *    None
 */

public class Magazine {
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;

    /**
     * Constructor Name: Magazine
     * @param title             (String)
     * @param publisher         (String)
     * @param issueNumber       (int)
     * @param publicationYear   (int)
     * 
     * Inside the Constructor
     *  1. Using setters in the function to ensure argument validation happens.
     */
    public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
        setTitle(title);
        setPublisher(publisher);
        setIssueNumber(issueNumber);
        setPublicationYear(publicationYear);
    }

    /**
     * Constructor Name: Magazine
     * @param source (Magazine)
     * 
     * Inside the Constructor
     *  1. Using setters in the function to ensure argument validation happens.
     */
    public Magazine(Magazine source) {
        setTitle(source.title);
        setPublisher(source.publisher);
        setIssueNumber(source.issueNumber);
        setPublicationYear(source.publicationYear);
    }

    /**
     * Getter Name: getTitle
     * @return (String)
     * 
     * Inside the Getter
     *  1. Gets the title of the Magazine.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter Name: setTitle
     * @param title (String)
     * 
     * Inside the Setter
     *  1. Validates whether the title is null or blank.
     */
    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("The title cannot be null or blank.");
        }
        this.title = title;
    }

    /**
     * Getter Name: getPublisher
     * @return (String)
     * 
     * Inside the Getter
     *  1. Gets the publisher of the Magazine.
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Setter Name: setPublisher
     * @param publisher (String)
     * 
     * Inside the Setter
     *  1. Validates whether the publisher is null or blank.
     */
    public void setPublisher(String publisher) {
        if (publisher == null || publisher.isBlank()) {
            throw new IllegalArgumentException("The publisher cannot be null or blank.");
        }
        this.publisher = publisher;
    }

    /**
     * Getter Name: getIssueNumber
     * @return (iny)
     * 
     * Inside the Getter
     *  1. Gets the issue number of the Magazine.
     */
    public int getIssueNumber() {
        return this.issueNumber;
    }

    /**
     * Setter Name: setIssueNumber
     * @param issueNumber (int)
     * 
     * Inside the Setter
     *  1. Validates whether the issue number is <= 0.
     */
    public void setIssueNumber(int issueNumber) {
        if (issueNumber <= 0) {
            throw new IllegalArgumentException("The issue number cannot be less than or equal to 0.");
        }
        this.issueNumber = issueNumber;
    }

    /**
     * Getter Name: getPublicationYear
     * @return (int)
     * 
     * Inside the Getter
     *  1. Gets the publication year of the Magazine.
     */
    public int getPublicationYear() {
        return this.publicationYear;
    }

    /**
     * Setter Name: setPublicationYear
     * @param publicationYear (int)
     * 
     * Inside the Setter
     *  1. Validates whether the publication year is <= 0.
     */
    public void setPublicationYear(int publicationYear) {
        if (publicationYear <= 0) {
            throw new IllegalArgumentException("The publication year cannot be less than or equal to 0.");
        }
        this.publicationYear = publicationYear;
    }
}