package hudson.plugins.zfs;

import hudson.Extension;
import hudson.model.ManagementLink;

/**
 * Exposes the ZFS snapshot based back up mechanism.
 *
 * @author Kohsuke Kawaguchi
 */
@Extension
public class BackupManager extends ManagementLink {
    public String getIconFileName() {
        // TODO
        throw new UnsupportedOperationException();
    }

    public String getUrlName() {
        return "backup";
    }

    public String getDisplayName() {
        return "Manage Back ups";
    }
}
