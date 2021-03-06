package com.cdp.enums;

import com.cdp.util.AutomationException;

/**
 * Created by romanna - 2019.
 */
public enum OSDriverInfo {
    WINDOWS_86 {
        @Override
        public String getPath(Browser browser) {
            String path;
            if (browser == Browser.CHROME) {
                path = "";
            } else {
                throw new AutomationException("There is no path defined");
            }
            return path;
        }
    },
    WINDOWS_64 {
        @Override
        public String getPath(Browser browser) {
            String path;
            if (browser == Browser.CHROME) {
                path = "src\\main\\resources\\window64\\chromedriver.exe";
            } else {
                throw new AutomationException("There is no path defined");
            }
            return path;
        }
    },
    LINUX_86 {
        @Override
        public String getPath(Browser browser) {
            String path;
            if (browser == Browser.CHROME) {
                path = "";
            } else {
                throw new AutomationException("There is no path defined");
            }
            return path;
        }
    },

    LINUX_64 {
        @Override
        public String getPath(Browser browser) {
            String path;
            if (browser == Browser.CHROME) {
                path = "";
            } else {
                throw new AutomationException("There is no path defined");
            }
            return path;
        }
    },
    MACOS {
        @Override
        public String getPath(Browser browser) {
            String path;
            if (browser == Browser.CHROME) {
                path = "src/main/resources/macos/chromedriver";
            } else {
                throw new AutomationException("There is no path defined");
            }
            return path;
        }
    };

    public abstract String getPath(Browser browser);


    public String getDriverName(Browser browser) {
        String driverName;
        switch (browser) {
            case CHROME:
                driverName = "webdriver.chrome.driver";
                break;
            default:
                throw new AutomationException("There is no driver name defined");
        }
        return driverName;
    }
}
