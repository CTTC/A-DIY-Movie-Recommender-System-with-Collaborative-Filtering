
public class MinutesFilter implements Filter {
	private int min;
	private int max;
	public MinutesFilter(int minm, int maxm) {
		min = minm;
		max = maxm;
	}
	@Override
	public boolean satisfies(String id) {
		int minutes = MovieDatabase.getMinutes(id);
		if (minutes >= min && minutes <= max)
		{
			return true;
		}
		return false;
	}

}
