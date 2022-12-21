package component.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class CustomFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(CustomFilter.class);

    @Override
    public void init(FilterConfig filterConfig) {
        logger.debug("init: {}", filterConfig);
        // 初期化処理
        // アプリケーション起動時に呼び出される
        // サーブレットフィルタの初期化パラメータは引数のFilterConfigから取得できる
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        logger.debug("doFilter: {} {}", request, response);
        // 前処理
        // 後続処理(次のFilterまたはServlet)を呼び出したくない場合は、このタイミングでreturn

        // 後続処理を呼び出す
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        logger.debug("debug");
        // アプリケーション終了時に実行
    }
}
