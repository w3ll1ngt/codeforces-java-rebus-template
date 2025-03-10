import java.util.*;
import java.io.*;

public class FileReadTemplate {
	FastScanner in;
	PrintWriter out;

	public void solve() throws IOException {
		int x = in.nextInt();
		out.printf("done: %d%n", x);
	}

	public void run() {
		try {
			in = new FastScanner(new File("input.in"));
			out = new PrintWriter(new File("output.out"));

			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

	public static void main(String[] arg) {
		new FileReadTemplate().run();
	}
}