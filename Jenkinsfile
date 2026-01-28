#!/usr/bin/env groovy
/*
 * pragmatickm-website - The pragmatickm.com website.
 * Copyright (C) 2021, 2022, 2023, 2024, 2025, 2026  AO Industries, Inc.
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
binding.setVariable('upstreamProjects', [
  // Parent
  'parent', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-parent</artifactId>

  // "development" profile
  // Runtime Direct
  '../semanticcms-1.x/openfile/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-openfile-all</artifactId>
  '../semanticcms-1.x/view-all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-all</artifactId>
  '../semanticcms-1.x/view-tree', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-tree</artifactId>
  '../semanticcms-1.x/view-what-links-here', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-view-what-links-here</artifactId>

  // "publish" profile
  // Dependencies for javadocs
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact</artifactId><classifier>javadoc</classifier>
  'contact/model', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-model</artifactId><classifier>javadoc</classifier>
  'contact/servlet', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-servlet</artifactId><classifier>javadoc</classifier>
  'contact/style', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-style</artifactId><classifier>javadoc</classifier>
  'contact/taglib', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-taglib</artifactId><classifier>javadoc</classifier>
  'contact/view', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-view</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-parent</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password</artifactId><classifier>javadoc</classifier>
  'password/model', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-model</artifactId><classifier>javadoc</classifier>
  'password/servlet', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-servlet</artifactId><classifier>javadoc</classifier>
  'password/style', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-style</artifactId><classifier>javadoc</classifier>
  'password/taglib', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-taglib</artifactId><classifier>javadoc</classifier>
  'password/view', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-view</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure</artifactId><classifier>javadoc</classifier>
  'procedure/model', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-model</artifactId><classifier>javadoc</classifier>
  'procedure/servlet', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-servlet</artifactId><classifier>javadoc</classifier>
  'procedure/style', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-style</artifactId><classifier>javadoc</classifier>
  'procedure/taglib', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-taglib</artifactId><classifier>javadoc</classifier>
  'procedure/view', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-view</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-all</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-bom</artifactId><classifier>javadoc</classifier>
  // No apidocs: <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task</artifactId><classifier>javadoc</classifier>
  'task/model', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-model</artifactId><classifier>javadoc</classifier>
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
  'contact/servlet-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-servlet-book</artifactId>
  'contact/style-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-style-book</artifactId>
  'contact/taglib-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-taglib-book</artifactId>
  'contact/view-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-view-book</artifactId>
  'parent-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-parent-book</artifactId>
  'password/all-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-all-book</artifactId>
  'password/bom-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-bom-book</artifactId>
  'password/book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-book</artifactId>
  'password/model-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-model-book</artifactId>
  'password/servlet-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-servlet-book</artifactId>
  'password/style-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-style-book</artifactId>
  'password/taglib-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-taglib-book</artifactId>
  'password/view-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-view-book</artifactId>
  'procedure/all-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-all-book</artifactId>
  'procedure/bom-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-bom-book</artifactId>
  'procedure/book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-book</artifactId>
  'procedure/model-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-model-book</artifactId>
  'procedure/servlet-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-servlet-book</artifactId>
  'procedure/style-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-style-book</artifactId>
  'procedure/taglib-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-taglib-book</artifactId>
  'procedure/view-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-view-book</artifactId>
  'task/all-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-all-book</artifactId>
  'task/bom-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-bom-book</artifactId>
  'task/book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-book</artifactId>
  'task/model-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-model-book</artifactId>
  'task/servlet-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-servlet-book</artifactId>
  'task/style-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-style-book</artifactId>
  'task/taglib-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-taglib-book</artifactId>
  'task/view-book', // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-view-book</artifactId>
  '../semanticcms-1.x/core/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
  '../semanticcms-1.x/news/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
  '../semanticcms-1.x/section/all', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>

  // Runtime Direct
  '../oss/mime-mappings', // <groupId>com.aoapps</groupId><artifactId>ao-mime-mappings</artifactId>
  '../oss/servlet-filter-javaee', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-filter</artifactId>
  '../oss/servlet-util-javaee', // <groupId>com.aoapps</groupId><artifactId>ao-servlet-util</artifactId>
  '../semanticcms-1.x/google-analytics', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-google-analytics</artifactId>
  '../semanticcms-1.x/theme-documentation', // <groupId>com.semanticcms</groupId><artifactId>semanticcms-theme-documentation</artifactId>

  // BOM
  '../oss/javaee-web-api-bom', // <groupId>com.aoapps</groupId><artifactId>javaee-web-api-bom</artifactId>
])

/******************************************************************************************
 *                                                                                        *
 * Everything below this line is identical for all projects, except the copied matrix     *
 * axes and any "Begin .*custom" / "End .*custom" blocks (see filter_custom script).      *
 *                                                                                        *
 *****************************************************************************************/

// Load ao-jenkins-shared-library
// TODO: Put @Library on import once we have our first library class
// TODO: Replace master with a specific tag version number once working
@Library('ao@master') _
ao.setVariables(binding, currentBuild, scm, params)

pipeline {
  agent any
  options {
    ansiColor('xterm')
    disableConcurrentBuilds(abortPrevious: true)
    quietPeriod(quietPeriod)
    skipDefaultCheckout()
    timeout(time: PIPELINE_TIMEOUT, unit: TIMEOUT_UNIT)
    // Only allowed to copy build artifacts from self
    // See https://plugins.jenkins.io/copyartifact/
    copyArtifactPermission("/${JOB_NAME}")
  }
  parameters {
    string(
      name: 'BuildPriority',
      defaultValue: "$buildPriority",
      description: BuildPriority_description
    )
    booleanParam(
      name: 'abortOnUnreadyDependency',
      defaultValue: true,
      description: abortOnUnreadyDependency_description
    )
    booleanParam(
      name: 'requireLastBuild',
      defaultValue: true,
      description: requireLastBuild_description
    )
    booleanParam(
      name: 'mavenDebug',
      defaultValue: false,
      description: mavenDebug_description
    )
    choice(
      name: 'sonarQubeAnalysis',
      choices: sonarQubeAnalysis_choices,
      description: sonarQubeAnalysis_description
    )
  }
  triggers {
    upstream(
      threshold: hudson.model.Result.SUCCESS,
      upstreamProjects: "${prunedUpstreamProjects.join(', ')}"
    )
    cron(cron)
  }
  stages {
    stage('Setup') {
      steps {
        script {
          // Additional setup that cannot be done in options inside declarative pipeline
          ao.setupBuildDiscarder()
        }
      }
    }
    stage('Check Ready') {
      when {
        expression {
          return (params.abortOnUnreadyDependency == null) ? true : params.abortOnUnreadyDependency
        }
      }
      steps {
        script {
          ao.checkReadySteps()
        }
      }
    }
    stage('Workaround Git #27287') {
      when {
        expression {
          ao.continueCurrentBuild() && projectDir != '.' && fileExists('.gitmodules')
        }
      }
      steps {
        script {
          ao.workaroundGit27287Steps(scmUrl, scmBranch, scmBrowser, sparseCheckoutPaths, disableSubmodules)
        }
      }
    }
    stage('Checkout SCM') {
      when {
        expression {
          ao.continueCurrentBuild()
        }
      }
      steps {
        script {
          ao.checkoutScmSteps(projectDir, niceCmd, scmUrl, scmBranch, scmBrowser, sparseCheckoutPaths, disableSubmodules)
        }
      }
    }
    stage('Builds') {
      matrix {
        when {
          expression {
            ao.continueCurrentBuild()
          }
        }
        axes {
          axis {
            name 'jdk'
            values '11', '17', '21' // buildJdks
          }
        }
        stages {
          stage('Build') {
            steps {
              script {
                ao.buildSteps(projectDir, niceCmd, maven, deployJdk, mavenOpts, mvnCommon, jdk, buildPhases, testWhenExpression, testJdks)
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
            ao.continueCurrentBuild() && testWhenExpression.call()
          }
        }
        axes {
          axis {
            name 'jdk'
            values '11', '17', '21' // buildJdks
          }
          axis {
            name 'testJdk'
            values '11', '17', '21' // testJdks
          }
        }
        stages {
          stage('Test') {
            steps {
              script {
                ao.testSteps(projectDir, niceCmd, deployJdk, maven, mavenOpts, mvnCommon, jdk, testJdk)
              }
            }
          }
        }
      }
    }
    stage('Deploy') {
      when {
        expression {
          ao.continueCurrentBuild()
        }
      }
      steps {
        script {
          ao.deploySteps(projectDir, niceCmd, deployJdk, maven, mavenOpts, mvnCommon)
        }
      }
    }
    stage('SonarQube analysis') {
      when {
        expression {
          ao.continueCurrentBuild() && sonarqubeWhenExpression.call()
        }
      }
      steps {
        script {
          ao.sonarQubeAnalysisSteps(projectDir, niceCmd, deployJdk, maven, mavenOpts, mvnCommon)
        }
      }
    }
    stage('Quality Gate') {
      when {
        expression {
          ao.continueCurrentBuild() && sonarqubeWhenExpression.call()
        }
      }
      steps {
        script {
          ao.qualityGateSteps()
        }
      }
    }
    stage('Analysis') {
      when {
        expression {
          ao.continueCurrentBuild()
        }
      }
      steps {
        script {
          ao.analysisSteps()
        }
      }
    }
  }
  post {
    failure {
      script {
        ao.postFailure(failureEmailTo)
      }
    }
  }
}
