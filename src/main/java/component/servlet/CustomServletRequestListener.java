package component.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Servlet標準APIである`javax.servlet.ServletRequestListener`インターフェースを実装
 * クラスをサーブレットコンテナに登録すると、リクエスト開始時とリクエスト終了時のタイミングで
 * 任意の処理を実行することができる
 **/
public class CustomServletRequestListener implements ServletRequestListener {
    private static final Logger logger = LoggerFactory.getLogger(CustomServletRequestListener.class);

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        logger.debug("requestInitialized: {}", sre);
        // リクエスト開始時の処理
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        logger.debug("requestDestroyed: {}", sre);
        // リクエスト終了時の処理
    }
}
