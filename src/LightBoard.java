public class LightBoard
{
    public boolean[][] lights;

    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numCols][numCols];
        for (int i = 0;i<numRows;i++)
        {
            for(int j=0;j<numCols;j++)
            {
                double random = Math.random();
                if(random > .59)
                {
                    lights[i][j] = false;
                }
                else{
                    lights[i][j] = true;
                }

            }
        }
    }

    public boolean evaluateLight(int row, int col)
    {
        int count = 0;
        if (lights[row][col])
        {
            for(int i=0;i < lights[row].length;i++)
            {
                if(lights[row][i])
                {
                    count++;
                }
            }
            if(count%2 == 0)
            {
                return false;
            }
            return true;
        }
        else
            {
            for(int i=0;i < lights[row].length;i++)
                {
                    if(lights[row][i])
                    {
                        count++;
                    }
                }
                if(count%3 == 0)
                {
                    return true;
                }
                return false;
            }
    }
}
