package cgeo.geocaching.utils;

import static org.assertj.core.api.Java6Assertions.assertThat;
import junit.framework.TestCase;

public class ProcessUtilsTest extends TestCase {

    public static void testIsInstalled() {
        assertThat(ProcessUtils.isInstalled("com.android.settings")).isTrue();
    }

    public static void testIsInstalledNotLaunchable() {
        final String packageName = "com.android.systemui";
        assertThat(ProcessUtils.isInstalled(packageName)).isTrue();
        assertThat(ProcessUtils.isLaunchable(packageName)).isFalse();
    }

    public static void testIsLaunchable() {
        assertThat(ProcessUtils.isLaunchable("com.android.settings")).isTrue();
    }

}
