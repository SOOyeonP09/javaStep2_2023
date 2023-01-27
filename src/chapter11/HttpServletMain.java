package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {

		method(new LoginService());
		method(new FileDownloadService());

	}

	// 메소드명은 method(static)으로한다.
	public static void method(HttpServlet http) {
		http.service();

	}
}
