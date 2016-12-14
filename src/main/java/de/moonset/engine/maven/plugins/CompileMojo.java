package de.moonset.engine.maven.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Created by pitt on 14.12.16.
 */

@Mojo(name = "compile")
public class CompileMojo extends AbstractMojo {
		public void execute() throws MojoExecutionException, MojoFailureException {
				getLog().info("compile");
		}
}
