/**
 * Created by jvishal on 12/25/16.
 */
public class NameAsterikDiamond {

    private int size;

    NameAsterikDiamond(int size)
    {
        this.size = size;
    }

    public String displayNameAsterikdiamond()
    {
        StringBuilder pattern = new StringBuilder();
        for(int upper=1; upper<=size-1; upper++)
        {
            addUpperSpace(pattern,upper);
            addUpperAsterik(pattern,upper);
            pattern.append("\n");
        }
        appendName(pattern);
        for(int down = size-1; down>=1 ; down--)
        {
            addLowerSpace(pattern,down);
            addLowerAsterik(pattern,down);
            if(down!=size)pattern.append("\n");
        }

        return pattern.toString();
    }

    private void appendName(StringBuilder pattern)
    {
        pattern.append(" Vishal\n");
    }

    private void addLowerSpace(StringBuilder pattern ,  int down)
    {
        for(int space = down; space <size; space ++)
            pattern.append(" ");
    }

    private void addLowerAsterik(StringBuilder pattern ,  int down)
    {
        for(int j=down*2-1; j>=1; j--)
            pattern.append("*");
    }

    private void addUpperSpace(StringBuilder pattern ,  int upper)
    {
        for(int space = size-1; space >= upper; space --)
            pattern.append(" ");
    }

    private void addUpperAsterik(StringBuilder pattern ,  int upper)
    {
        for(int j=1; j<=upper*2-1; j++)
            pattern.append("*");
    }

    public static void main(String[] args) {
        NameAsterikDiamond diamond = new NameAsterikDiamond(5);
        System.out.println(diamond.displayNameAsterikdiamond());
    }
}