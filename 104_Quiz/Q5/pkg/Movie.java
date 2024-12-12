package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String movieName, double rating, int numRatings, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public double getRating(){
        return rating;
    }
    public void addRating(double extra){
        this.numRatings = numRatings + 1;
        this.rating =  (rating * (numRatings-1) + extra) / numRatings;
    }
    public boolean compareRatings(Movie rate){
        if(rate.getRating() < this.rating){
            return true;
        }
        else{
            return false;
        }
    }
    public String revenueToString(){
        int revenue1 = revenue/100;
        int revenue2 = revenue/10000;
        int revenue3 = revenue/1000000;
        System.out.println(revenue3 + "," + revenue2 + "," + revenue1);
    }
}
