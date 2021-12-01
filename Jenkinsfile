#!/usr/bin/env groovy
/*
 * pragmatickm-website - The pragmatickm.com website.
 * Copyright (C) 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of pragmatickm-website.
 *
 * pragmatickm-website is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * pragmatickm-website is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with pragmatickm-website.  If not, see <https://www.gnu.org/licenses/>.
 */

// Parent, Extensions, Plugins, Direct and BOM Dependencies
def upstreamProjects = [
	// Parent
	'parent', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-parent</artifactId>

	// "development" profile
	// Runtime Direct
	'../semanticcms/openfile/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-all</artifactId>
	'../semanticcms/view-all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-all</artifactId>
	'../semanticcms/view-tree', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-tree</artifactId>
	'../semanticcms/view-what-links-here', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-what-links-here</artifactId>

	// "publish" profile
	// Dependencies for javadocs
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-all</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-bom</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-all</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-bom</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact</artifactId><classifier>javadoc</classifier>
	'contact/model', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-model</artifactId><classifier>javadoc</classifier>
	'contact/renderer-html', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-renderer-html</artifactId><classifier>javadoc</classifier>
	'contact/servlet', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-servlet</artifactId><classifier>javadoc</classifier>
	'contact/style', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-style</artifactId><classifier>javadoc</classifier>
	'contact/taglib', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-taglib</artifactId><classifier>javadoc</classifier>
	'contact/view', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-view</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-parent</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-all</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-bom</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password</artifactId><classifier>javadoc</classifier>
	'password/model', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-model</artifactId><classifier>javadoc</classifier>
	'password/renderer-html', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-renderer-html</artifactId><classifier>javadoc</classifier>
	'password/servlet', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-servlet</artifactId><classifier>javadoc</classifier>
	'password/style', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-style</artifactId><classifier>javadoc</classifier>
	'password/taglib', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-taglib</artifactId><classifier>javadoc</classifier>
	'password/view', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-view</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-all</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-bom</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure</artifactId><classifier>javadoc</classifier>
	'procedure/model', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-model</artifactId><classifier>javadoc</classifier>
	'procedure/renderer-html', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-renderer-html</artifactId><classifier>javadoc</classifier>
	'procedure/servlet', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-servlet</artifactId><classifier>javadoc</classifier>
	'procedure/style', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-style</artifactId><classifier>javadoc</classifier>
	'procedure/taglib', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-taglib</artifactId><classifier>javadoc</classifier>
	'procedure/view', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-view</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-all</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-bom</artifactId><classifier>javadoc</classifier>
	// No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task</artifactId><classifier>javadoc</classifier>
	'task/model', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-model</artifactId><classifier>javadoc</classifier>
	'task/renderer-html', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-renderer-html</artifactId><classifier>javadoc</classifier>
	'task/servlet', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-servlet</artifactId><classifier>javadoc</classifier>
	'task/style', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-style</artifactId><classifier>javadoc</classifier>
	'task/taglib', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-taglib</artifactId><classifier>javadoc</classifier>
	'task/view', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-view</artifactId><classifier>javadoc</classifier>

	// Direct
	'all-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-all-book</artifactId>
	'bom-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-bom-book</artifactId>
	'book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-book</artifactId>
	'contact/all-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-all-book</artifactId>
	'contact/bom-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-bom-book</artifactId>
	'contact/book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-book</artifactId>
	'contact/model-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-model-book</artifactId>
	'contact/renderer-html-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-renderer-html-book</artifactId>
	'contact/servlet-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-servlet-book</artifactId>
	'contact/style-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-style-book</artifactId>
	'contact/taglib-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-taglib-book</artifactId>
	'contact/view-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-view-book</artifactId>
	'parent-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-parent-book</artifactId>
	'password/all-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-all-book</artifactId>
	'password/bom-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-bom-book</artifactId>
	'password/book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-book</artifactId>
	'password/model-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-model-book</artifactId>
	'password/renderer-html-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-renderer-html-book</artifactId>
	'password/servlet-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-servlet-book</artifactId>
	'password/style-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-style-book</artifactId>
	'password/taglib-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-taglib-book</artifactId>
	'password/view-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-view-book</artifactId>
	'procedure/all-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-all-book</artifactId>
	'procedure/bom-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-bom-book</artifactId>
	'procedure/book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-book</artifactId>
	'procedure/model-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-model-book</artifactId>
	'procedure/renderer-html-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-renderer-html-book</artifactId>
	'procedure/servlet-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-servlet-book</artifactId>
	'procedure/style-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-style-book</artifactId>
	'procedure/taglib-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-taglib-book</artifactId>
	'procedure/view-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-view-book</artifactId>
	'task/all-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-all-book</artifactId>
	'task/bom-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-bom-book</artifactId>
	'task/book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-book</artifactId>
	'task/model-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-model-book</artifactId>
	'task/renderer-html-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-renderer-html-book</artifactId>
	'task/servlet-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-servlet-book</artifactId>
	'task/style-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-style-book</artifactId>
	'task/taglib-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-taglib-book</artifactId>
	'task/view-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-view-book</artifactId>
	'../semanticcms/core/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
	'../semanticcms/news/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
	'../semanticcms/section/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>

	// Runtime Direct
	'../oss/mime-mappings', // <groupId>com.aoapps</groupId><artifactId>ao-mime-mappings</artifactId>
	'../oss/servlet-filter', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-filter</artifactId>
	'../semanticcms/google-analytics', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-google-analytics</artifactId>
	'../semanticcms/theme-documentation', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-theme-documentation</artifactId>

	// BOM
	'../oss/javaee-web-api-bom', // <groupId>com.aoapps</groupId><artifactId>javaee-web-api-bom</artifactId>
]

/******************************************************************************************
 *                                                                                        *
 * Everything below this line is identical for all projects,                              *
 * except the copied matrix axes.                                                         *
 *                                                                                        *
 * See https://issues.jenkins.io/browse/JENKINS-61047                                     *
 * See https://issues.jenkins.io/browse/JENKINS-61280                                     *
 *                                                                                        *
 ******************************************************************************************
 *                                                                                        *
 * Variables that may be defined above this block:                                        *
 *                                                                                        *
 * deployJdk            The version of JDK that will be used for the deploy stage.        *
 *                      Defaults to '11'                                                  *
 *                                                                                        *
 * buildJdks            The array of JDK versions that will build.                        *
 *                      Defaults to ['11', '17']                                          *
 *                      Changes must be copied to matrix axes!                            *
 *                                                                                        *
 * testJdks             The array of JDK versions that will test against every build JDK. *
 *                      Defaults to ['11', '17']                                          *
 *                      Changes must be copied to matrix axes!                            *
 *                                                                                        *
 * upstreamProjects     The array of relative paths to upstream projects.                 *
 *                      Defaults to []                                                    *
 *                                                                                        *
 * projectDir           The directory within the workspace containing the Maven project.  *
 *                      Default depends on the path of Jenkinsfile:                       *
 *                          'Jenkinsfile'       -> '.'                                    *
 *                          'book/Jenkinsfile'  -> 'book'                                 *
 *                          'devel/Jenkinsfile' -> 'devel'                                *
 *                                                                                        *
 * disableSubmodules    Disables checkout of Git submodules.                              *
 *                      Defaults to true                                                  *
 *                                                                                        *
 * sparseCheckoutPaths  The sparse paths for Git checkout.                                *
 *                      Default depends on projectDir:                                    *
 *                          '.'     -> [[path:'/*'],                                      *
 *                                      [path:'!/book/'],                                 *
 *                                      [path:'!/devel/']]                                *
 *                          'book'  -> [[path:'/.gitignore'],                             *
 *                                      [path:'/book/']]                                  *
 *                          'devel' -> [[path:'/.gitignore'],                             *
 *                                      [path:'/devel/']]                                 *
 *                                                                                        *
 * scmUrl               The Git URL.                                                      *
 *                      Default depends on the project's SCM settings:                    *
 *                          scm.userRemoteConfigs[0].url                                  *
 *                                                                                        *
 * scmBranch            The Git branch name, without and ref/path prefix                  *
 *                      Default depends on the project's SCM settings:                    *
 *                          scm.branches[0].name: 'refs/heads/*' -> '*'                   *
 *                                                                                        *
 * scmBrowser           The Git SCM browser URL.                                          *
 *                      Default depends on scmUrl:                                        *
 *                          '/srv/git/ao-apps/*' -> 'https://github.com/ao-apps/*'        *
 *                          '/srv/git/nmwoss/*'  -> 'https://github.com/newmediaworks/*'  *
 *                          '/srv/git/*'         -> No default                            *
 *                                                                                        *
 * buildPriority        The build job priority from 1 to 30 (lower is build first).       *
 *                      Defaults to the depth in the upstreamProjects dependency graph.   *
 *                                                                                        *
 * quietPeriod          The time to delay between queuing job and starting build.         *
 *                      Default depends on buildPriority:                                 *
 *                          10 + buildPriority * 2                                        *
 *                                                                                        *
 * nice                 The nice level to run the build processes or 0 for none.          *
 *                      Default depends on buildPriority:                                 *
 *                          min(19, buildPriority - 1)                                    *
 *                                                                                        *
 * maven                The Maven tool to use.                                            *
 *                      Defaults to 'maven-3'                                             *
 *                                                                                        *
 * mavenOpts            The Maven Java options.                                           *
 *                      Defaults to '-Djansi.force' for colorful logs                     *
 *                                                                                        *
 * extraProfiles        An array of additional profiles to pass to Maven.                 *
 *                      Defaults to []                                                    *
 *                                                                                        *
 * testWhenExpression   A closure determining when to run tests.                          *
 *                      Defaults to {return fileExists(projectDir + '/src/test')}         *
 *                                                                                        *
 * failureEmailTo       The recipient of build failure emails.                            *
 *                      Defaults to 'support@aoindustries.com'                            *
 *                                                                                        *
 *****************************************************************************************/

// If RejectedAccessException, grant per-controller:
//   https://jenkins.aoindustries.com/scriptApproval/
//   "Approve"
//   Repeat until all permissions granted

// JDK versions
if (!binding.hasVariable('deployJdk')) {
	binding.setVariable('deployJdk', '11')
}
if (!binding.hasVariable('buildJdks')) {
	binding.setVariable(
		'buildJdks',
		['11', '17'] // Changes must be copied to matrix axes!
	)
}
if (!binding.hasVariable('testJdks')) {
	binding.setVariable(
		'testJdks',
		['11', '17'] // Changes must be copied to matrix axes!
	)
}
if (!binding.hasVariable('upstreamProjects')) {
	binding.setVariable('upstreamProjects', [])
}
if (!binding.hasVariable('projectDir')) {
	def scriptPath = currentBuild.rawBuild.parent.definition.scriptPath
	def projectDir
	if (scriptPath == 'Jenkinsfile') {
		projectDir = '.'
	} else if(scriptPath == 'book/Jenkinsfile') {
		projectDir = 'book'
	} else if(scriptPath == 'devel/Jenkinsfile') {
		projectDir = 'devel'
	} else {
		throw new Exception("Unexpected value for 'scriptPath': '$scriptPath'")
	}
	binding.setVariable('projectDir', projectDir)
}
if (!binding.hasVariable('disableSubmodules')) {
	binding.setVariable('disableSubmodules', true)
}
if (!binding.hasVariable('sparseCheckoutPaths')) {
	def sparseCheckoutPaths
	if (projectDir == '.') {
		sparseCheckoutPaths = [
			[path:'/*'],
			[path:'!/book/'],
			[path:'!/devel/']
		]
	} else if (projectDir == 'book' || projectDir == 'devel') {
		sparseCheckoutPaths = [
			[path:'/.gitignore'],
			[path:"/$projectDir/"]
		]
	} else {
		throw new Exception("Unexpected value for 'projectDir': '$projectDir'")
	}
	binding.setVariable('sparseCheckoutPaths', sparseCheckoutPaths)
}
if (!binding.hasVariable('scmUrl')) {
	// Automatically determine Git URL: https://stackoverflow.com/a/38255364
	if(scm.userRemoteConfigs.size() == 1) {
		binding.setVariable('scmUrl', scm.userRemoteConfigs[0].url)
	} else {
		throw new Exception("Precisely one SCM remote expected: '" + scm.userRemoteConfigs + "'")
	}
}
if (!binding.hasVariable('scmBranch')) {
	// Automatically determine branch
	if (scm.branches.size() == 1) {
		def scmBranchPrefix = 'refs/heads/'
		def scmBranch = scm.branches[0].name
		if (scmBranch.startsWith(scmBranchPrefix)) {
			scmBranch = scmBranch.substring(scmBranchPrefix.length())
			binding.setVariable('scmBranch', scmBranch)
		} else {
			throw new Exception("SCM branch does not start with '$scmBranchPrefix': '$scmBranch'")
		}
	} else {
		throw new Exception("Precisely one SCM branch expected: '" + scm.branches + "'")
	}
}
if (!binding.hasVariable('scmBrowser')) {
	// Automatically determine SCM browser
	def aoappsPrefix        = '/srv/git/ao-apps/'
	def newmediaworksPrefix = '/srv/git/nmwoss/'
	def scmBrowser
	if (scmUrl.startsWith(aoappsPrefix)) {
		// Is also mirrored to GitHub user "ao-apps"
		def repo = scmUrl.substring(aoappsPrefix.length())
		if(repo.endsWith('.git')) {
			repo = repo.substring(0, repo.length() - 4)
		}
		scmBrowser = [$class: 'GithubWeb',
			repoUrl: 'https://github.com/ao-apps/' + repo
		]
	} else if (scmUrl.startsWith(newmediaworksPrefix)) {
		// Is also mirrored to GitHub user "newmediaworks"
		def repo = scmUrl.substring(newmediaworksPrefix.length())
		if(repo.endsWith('.git')) {
			repo = repo.substring(0, repo.length() - 4)
		}
		scmBrowser = [$class: 'GithubWeb',
			repoUrl: 'https://github.com/newmediaworks/' + repo
		]
	} else if(scmUrl.startsWith('/srv/git/')) {
		// No default
		scmBrowser = null
	} else {
		throw new Exception("Unexpected SCM URL: '$scmUrl'")
	}
	binding.setVariable('scmBrowser', scmBrowser)
}

/*
 * Finds the upstream projects for the given job.
 * Returns an array of upstream projects, possibly empty but never null
 */
def getUpstreamProjects(jenkins, upstreamProjectsCache, workflowJob) {
	def fullName = workflowJob.fullName
	def upstreamProjects = upstreamProjectsCache[fullName]
	if(upstreamProjects == null) {
		upstreamProjects = []
		workflowJob.triggers?.each {triggerDescriptor, trigger ->
			if(trigger instanceof jenkins.triggers.ReverseBuildTrigger) {
				trigger.upstreamProjects.split(',').each {upstreamProject ->
					upstreamProject = upstreamProject.trim()
					if(upstreamProject != '') {
						upstreamProjects << upstreamProject
					}
				}
			} else {
				throw new Exception("$fullName: trigger is not a ReverseBuildTrigger: $upstreamFullName -> $trigger")
			}
		}
		upstreamProjectsCache[fullName] = upstreamProjects
	}
	return upstreamProjects
}

/*
 * Gets the set of full names for the given workflowJob and all transitive upstream projects.
 */
def getAllUpstreamProjects(jenkins, upstreamProjectsCache, allUpstreamProjectsCache, workflowJob) {
	def fullName = workflowJob.fullName
	def allUpstreamProjects = allUpstreamProjectsCache[fullName]
	if(allUpstreamProjects == null) {
		if(allUpstreamProjectsCache.containsKey(fullName)) {
			throw new Exception("$fullName: Loop detected in upstream project graph")
		}
		// Add to map with null for loop detection
		allUpstreamProjectsCache[fullName] = null
		// Create new set
		allUpstreamProjects = [] as Set<String>
		// Always contains self
		allUpstreamProjects << fullName
		// Transitively add all
		for(upstreamProject in getUpstreamProjects(jenkins, upstreamProjectsCache, workflowJob)) {
			def upstreamWorkflowJob = jenkins.getItem(upstreamProject, workflowJob)
			if(upstreamWorkflowJob == null) {
				throw new Exception("$fullName: upstreamWorkflowJob not found: '$upstreamProject'")
			}
			if(!(upstreamWorkflowJob instanceof org.jenkinsci.plugins.workflow.job.WorkflowJob)) {
				throw new Exception("$fullName: $upstreamProject: upstreamWorkflowJob is not a WorkflowJob: $upstreamWorkflowJob")
			}
			allUpstreamProjects.addAll(getAllUpstreamProjects(jenkins, upstreamProjectsCache, allUpstreamProjectsCache, upstreamWorkflowJob))
		}
		// Cache result
		allUpstreamProjectsCache[fullName] = allUpstreamProjects
	}
	return allUpstreamProjects
}

/*
 * Prunes upstream projects in two ways:
 *
 * 1) Remove duplicates by job fullName (handles different relative paths to same project)
 *
 * 2) Removes direct upstream projects that are also transitive through others
 */
def pruneUpstreamProjects(jenkins, upstreamProjectsCache, currentWorkflowJob, upstreamProjects) {
	// Quick unique by name, and ensures a new object to not affect parameter
	upstreamProjects = upstreamProjects.unique()
	// Find the set of all projects for each upstreamProject
	def upstreamFullNames = []
	def allUpstreamProjects = []
	def allUpstreamProjectsCache = [:]
	for(upstreamProject in upstreamProjects) {
		def upstreamWorkflowJob = jenkins.getItem(upstreamProject, currentWorkflowJob)
		if(upstreamWorkflowJob == null) {
			throw new Exception("${currentWorkflowJob.fullName}: upstreamWorkflowJob not found: '$upstreamProject'")
		}
		if(!(upstreamWorkflowJob instanceof org.jenkinsci.plugins.workflow.job.WorkflowJob)) {
			throw new Exception("${currentWorkflowJob.fullName}: $upstreamProject: upstreamWorkflowJob is not a WorkflowJob: $upstreamWorkflowJob")
		}
		upstreamFullNames << upstreamWorkflowJob.fullName
		allUpstreamProjects << getAllUpstreamProjects(jenkins, upstreamProjectsCache, allUpstreamProjectsCache, upstreamWorkflowJob)
	}
	allUpstreamProjectsCache = null
	// Prune upstream, quadratic algorithm
	def pruned = []
	def len = upstreamProjects.size()
	assert len == upstreamFullNames.size()
	assert len == allUpstreamProjects.size()
	for(int i = 0; i < len; i++) {
		def upstreamFullName = upstreamFullNames[i]
		// Make sure no contained by any other upstream
		def transitiveOnOther = false
		for(int j = 0; j < len; j++) {
			if(j != i && allUpstreamProjects[j].contains(upstreamFullName)) {
				//echo "pruneUpstreamProjects: ${currentWorkflowJob.fullName}: Pruned due to transitive: $upstreamFullName found in ${upstreamProjects[j]}"
				transitiveOnOther = true
				break
			}
		}
		if(!transitiveOnOther) {
			//echo "pruneUpstreamProjects: ${currentWorkflowJob.fullName}: Direct: ${upstreamProjects[i]}"
			pruned << upstreamProjects[i]
		}
	}
	return pruned
}

/*
 * Finds the depth of the given job in the upstream project graph
 * Top-most projects will be 1, which matches the job priorities for Priority Sorter plugin
 *
 * Uses depthMap for tracking
 *
 * Mapping from project full name to depth, where final depth is >= 1
 * During traversal, a project is first added to the map with a value of 0, which is used to detect graph loops
 */
def getDepth(jenkins, upstreamProjectsCache, depthMap, workflowJob, jobUpstreamProjects) {
	def fullName = workflowJob.fullName
	def depth = depthMap[fullName]
	if(depth == null) {
		// Add to map with value 0 for loop detection
		depthMap[fullName] = 0
		def maxUpstream = 0
		jobUpstreamProjects.each {upstreamProject ->
			def upstreamWorkflowJob = jenkins.getItem(upstreamProject, workflowJob)
			if(upstreamWorkflowJob == null) {
				throw new Exception("$fullName: upstreamWorkflowJob not found: '$upstreamProject'")
			}
			if(!(upstreamWorkflowJob instanceof org.jenkinsci.plugins.workflow.job.WorkflowJob)) {
				throw new Exception("$fullName: $upstreamProject: upstreamWorkflowJob is not a WorkflowJob: $upstreamWorkflowJob")
			}
			def upstreamProjects = getUpstreamProjects(jenkins, upstreamProjectsCache, upstreamWorkflowJob)
			def upstreamDepth = getDepth(jenkins, upstreamProjectsCache, depthMap, upstreamWorkflowJob, upstreamProjects)
			if(upstreamDepth > maxUpstream) maxUpstream = upstreamDepth
		}
		depth = maxUpstream + 1
		//echo "$fullName: $depth"
		depthMap[fullName] = depth
	} else if(depth == 0) {
		throw new Exception("$fullName: Loop detected in upstream project graph")
	}
	return depth;
}

// Variables temporarily used in project resolution
def tempUpstreamProjectsCache = [:]
def tempJenkins = Jenkins.get()
// Find the current project
def tempCurrentWorkflowJob = currentBuild.rawBuild.parent
if(!(tempCurrentWorkflowJob instanceof org.jenkinsci.plugins.workflow.job.WorkflowJob)) {
	throw new Exception("tempCurrentWorkflowJob is not a WorkflowJob: $tempCurrentWorkflowJob")
}

// Prune set of upstreamProjects
def prunedUpstreamProjects = pruneUpstreamProjects(tempJenkins, tempUpstreamProjectsCache, tempCurrentWorkflowJob, upstreamProjects)

if (!binding.hasVariable('buildPriority')) {
	// Find the longest path through all upstream projects, which will be used as both job priority and
	// nice value.  This will ensure proper build order in all cases.  However, it may prevent some
	// possible concurrency since reduction to simple job priority number loses information about which
	// are critical paths on the upstream project graph.
	def buildPriority = getDepth(tempJenkins, tempUpstreamProjectsCache, [:], tempCurrentWorkflowJob, prunedUpstreamProjects)
	if(buildPriority > 30) throw new Exception("buildPriority > 30, increase global configuration: $buildPriority")
	binding.setVariable('buildPriority', buildPriority)
}
if(buildPriority < 1 || buildPriority > 30) {
	throw new Exception("buildPriority out of range 1 - 30: $buildPriority")
}

// Remove temporary variables
tempUpstreamProjectsCache = null
tempJenkins = null
tempCurrentWorkflowJob = null

if (!binding.hasVariable('quietPeriod')) {
	binding.setVariable('quietPeriod', 10 + buildPriority * 2)
}
if (!binding.hasVariable('nice')) {
	def nice = buildPriority - 1;
	if(nice > 19) nice = 19;
	binding.setVariable('nice', nice)
}
if (!binding.hasVariable('maven')) {
	binding.setVariable('maven', 'maven-3')
}
if (!binding.hasVariable('mavenOpts')) {
	binding.setVariable('mavenOpts', '-Djansi.force')
}
if (!binding.hasVariable('extraProfiles')) {
	binding.setVariable('extraProfiles', [])
}
if (!binding.hasVariable('testWhenExpression')) {
	binding.setVariable('testWhenExpression',
		{return fileExists(projectDir + '/src/test')}
	)
}
if (!binding.hasVariable('failureEmailTo')) {
	binding.setVariable('failureEmailTo', 'support@aoindustries.com')
}

// Common settings
def mvnCommon   = "-Dstyle.color=always -N -DaltDeploymentRepository=local-private-distribution::default::file:///var/maven2 -Pjenkins,POST-SNAPSHOT${extraProfiles.isEmpty() ? '' : (',' + extraProfiles.join(','))}"
def buildPhases = 'clean process-test-classes'

// Determine nice command prefix or empty string for none
def niceCmd = (nice == 0) ? '' : "nice -n${nice} "

pipeline {
	agent any
	options {
		ansiColor('xterm')
		disableConcurrentBuilds(abortPrevious: true)
		quietPeriod(quietPeriod)
		skipDefaultCheckout()
		timeout(time: 2, unit: 'HOURS')
		buildDiscarder(logRotator(numToKeepStr:'50'))
	}
	parameters {
		string(name: 'BuildPriority', defaultValue: "$buildPriority", description: "Specify the priority of this build.\nDefaults to project's depth in the upstream project graph")
	}
	triggers {
		upstream(
			threshold: hudson.model.Result.SUCCESS,
			upstreamProjects: "${prunedUpstreamProjects.join(', ')}"
		)
	}
	stages {
		stage('Checkout SCM') {
			steps {
				// See https://www.jenkins.io/doc/pipeline/steps/workflow-scm-step/#checkout-check-out-from-version-control
				// See https://stackoverflow.com/questions/43293334/sparsecheckout-in-jenkinsfile-pipeline
				checkout scm: [$class: 'GitSCM',
					userRemoteConfigs: [[
						url: scmUrl,
						refspec: "+refs/heads/$scmBranch:refs/remotes/origin/$scmBranch"
					]],
					branches: [[name: "refs/heads/$scmBranch"]],
					browser: scmBrowser,
					extensions: [
						// CleanCheckout was too aggressive and removed the workspace .m2 folder, added "sh" steps below
						// [$class: 'CleanCheckout'],
						[$class: 'CloneOption',
							// See https://issues.jenkins.io/browse/JENKINS-45586
							shallow: true,
							depth: 2, // We expect a build on every commit
							honorRefspec: true
						],
						[$class: 'SparseCheckoutPaths',
							sparseCheckoutPaths: sparseCheckoutPaths
						],
						[$class: 'SubmoduleOption',
							disableSubmodules: disableSubmodules,
							shallow: true,
							depth: 2 // We expect a build on every commit
						]
					]
				]
				sh "${niceCmd}git verify-commit HEAD"
				sh "${niceCmd}git reset --hard"
				sh "${niceCmd}git clean -fdx -e ${(projectDir == '.') ? '/.m2' : ('/' + projectDir + '/.m2')}"
				// Make sure working tree not modified after checkout
				sh """#!/bin/bash
s="\$(${niceCmd}git status --short)"
if [ "\$s" != "" ]
then
  echo "Working tree modified after checkout:"
  echo "\$s"
  exit 1
fi
"""
			}
		}
		stage('Builds') {
			matrix {
				axes {
					axis {
						name 'jdk'
						values '11', '17' // buildJdks
					}
				}
				stages {
					stage('Build') {
						environment {
							mavenLocalRepo = "${(jdk == deployJdk) ? '.m2/repository' : ('.m2/repository-jdk-' + jdk)}"
						}
						steps {
							dir(projectDir) {
								withMaven(
									maven: maven,
									mavenOpts: mavenOpts,
									mavenLocalRepo: mavenLocalRepo,
									jdk: "jdk-$jdk"
								) {
									sh "${niceCmd}$MVN_CMD $mvnCommon -Dalt.build.dir=target/jdk-$jdk $buildPhases"
								}
								script {
									// Create a separate copy for full test matrix
									testJdks.each() {testJdk ->
										if (testJdk != jdk) {
											sh "${niceCmd}rm target/jdk-$jdk-$testJdk -rf"
											sh "${niceCmd}cp -al target/jdk-$jdk target/jdk-$jdk-$testJdk"
										}
									}
								}
							}
						}
					}
				}
			}
		}
		stage('Tests') {
			matrix {
				when {
					expression {
						return testWhenExpression.call()
					}
				}
				axes {
					axis {
						name 'jdk'
						values '11', '17' // buildJdks
					}
					axis {
						name 'testJdk'
						values '11', '17' // testJdks
					}
				}
				stages {
					stage('Test') {
						environment {
							mavenLocalRepo = "${(jdk == deployJdk) ? '.m2/repository' : ('.m2/repository-jdk-' + jdk)}"
							buildDir       = "${(testJdk == jdk) ? ('target/jdk-' + jdk) : ('target/jdk-' + jdk + '-' + testJdk)}"
							coverage       = "${(jdk == deployJdk && testJdk == deployJdk && fileExists(projectDir + '/src/main/java') && fileExists(projectDir + '/src/test')) ? '-Pcoverage' : '-P!coverage'}"
							testGoals      = "${(coverage == '-Pcoverage') ? 'jacoco:prepare-agent surefire:test jacoco:report' : 'surefire:test'}"
						}
						steps {
							dir(projectDir) {
								withMaven(
									maven: maven,
									mavenOpts: mavenOpts,
									mavenLocalRepo: mavenLocalRepo,
									jdk: "jdk-$testJdk"
								) {
									sh "${niceCmd}$MVN_CMD $mvnCommon -Dalt.build.dir=$buildDir $coverage $testGoals"
								}
							}
						}
					}
				}
			}
		}
		stage('Deploy') {
			steps {
				// Make sure working tree not modified by build or test
				sh """#!/bin/bash
s="\$(${niceCmd}git status --short)"
if [ "\$s" != "" ]
then
  echo "Working tree modified during build or test:"
  echo "\$s"
  exit 1
fi
"""
				dir(projectDir) {
					// Temporarily move surefire-reports before withMaven to avoid duplicate logging of test results
					sh """#!/bin/bash
if [ -d target/jdk-$deployJdk/surefire-reports ]
then
  mv target/jdk-$deployJdk/surefire-reports target/jdk-$deployJdk/surefire-reports.do-not-report-twice
fi
"""
					withMaven(
						maven: maven,
						mavenOpts: mavenOpts,
						mavenLocalRepo: '.m2/repository',
						jdk: "jdk-$deployJdk"
					) {
						sh "${niceCmd}$MVN_CMD $mvnCommon -Pjenkins-deploy -Dalt.build.dir=target/jdk-$deployJdk deploy"
					}
					// Restore surefire-reports
					sh """#!/bin/bash
if [ -d target/jdk-$deployJdk/surefire-reports.do-not-report-twice ]
then
  mv target/jdk-$deployJdk/surefire-reports.do-not-report-twice target/jdk-$deployJdk/surefire-reports
fi
"""
				}
				// Make sure working tree not modified by deploy
				sh """#!/bin/bash
s="\$(${niceCmd}git status --short)"
if [ "\$s" != "" ]
then
  echo "Working tree modified during deploy:"
  echo "\$s"
  exit 1
fi
"""
			}
		}
	}
	post {
		failure {
			emailext to: failureEmailTo,
				subject: "[Jenkins] ${currentBuild.fullDisplayName} build failed",
				body: "${env.BUILD_URL}console"
		}
	}
}
