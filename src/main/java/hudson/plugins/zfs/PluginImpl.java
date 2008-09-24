package hudson.plugins.zfs;

import hudson.Plugin;
import hudson.model.ManagementLink;

/**
 * @author Kohsuke Kawaguchi
 */
public class PluginImpl extends Plugin {
    public void start() throws Exception {
        ManagementLink.LIST.add(new BackupManager());
    }
}
