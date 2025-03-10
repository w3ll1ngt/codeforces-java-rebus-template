import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Template {
	FastScanner in;
	PrintWriter out;

	public static void main(String[] arg) {
		new Template().run();
	}

	public void solve() {
		List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4);

		Map<Integer, Long> res = list.stream()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		out.println(res);
	}

	public void run() {
		in = new FastScanner();
		out = new PrintWriter(new OutputStreamWriter(System.out));

		solve();

		out.close();
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;


		FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
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
}
