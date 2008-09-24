package hudson.plugins.zfs;

import hudson.model.ManagementLink;

/**
 * Exposes the ZFS snapshot based back up mechanism.
 *
 * @author Kohsuke Kawaguchi
 */
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
