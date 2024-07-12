package recarr;

	public class coitoss{
		public static void main(String[] args) {
			CT(3, "", false);
		}

		public static void CT(int n, String path, boolean isH) {
			if (n == 0) {
				System.out.println(path);
				return;

			}
//			if (isH == false) {
			CT(n - 1, path + "H", true);
//			}
			CT(n - 1, path + "T", false);

		}

}
