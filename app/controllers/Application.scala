/**
 * Copyright 2010-2013 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  val latestScaladoc = "http://doc.scalatest.org/1.9.1"
  val latestVersion = "1.9.1"
  val milestoneVersion = "2.0.M5b"
  val milestoneScaladoc = "http://www.artima.com/docs-scalatest-2.0.M5b"
  val scaladocsLocation = "http://doc.scalatest.org"
  val releasesLocation = "http://www.artima.com/downloadScalaTest"
  val baseScalaVersion = "2.10.0"

  def index = Action {
    Ok(views.html.index())
  }

  def download = Action {
    Ok(views.html.download())
  }

  def quickStart = Action {
    Ok(views.html.quickStart())
  }

  def scaladoc = Action {
    Ok(views.html.scaladoc())
  }

  def community = Action {
    Ok(views.html.community())
  }

  def about = Action {
    Ok(views.html.about())
  }

/*
  def releaseNotes = Action {
    Ok(views.html.releaseNotes())
  }
*/

  def gettingStartedWithFunSuite = Action {
    Ok(views.html.gettingStartedWithFunSuite())
  }

  def gettingStartedWithFunSpec = Action {
    Ok(views.html.gettingStartedWithFunSpec())
  }

  def gettingStartedWithFeatureSpec = Action {
    Ok(views.html.gettingStartedWithFeatureSpec())
  }

  def writingJunitAndTestngTestsInScala = Action {
    Ok(views.html.writingJunitAndTestngTestsInScala())
  }

  def gettingStartedWithJunit3InScala = Action {
    Ok(views.html.gettingStartedWithJunit3InScala())
  }

  def gettingStartedWithJunit4InScala = Action {
    Ok(views.html.gettingStartedWithJunit4InScala())
  }

  def gettingStartedWithTestngInScala = Action {
    Ok(views.html.gettingStartedWithTestngInScala())
  }

  // Redirect Scaladoc URLs
  def scaladocs(release: String) = Action {
    Redirect(scaladocsLocation + "/" + release + "/index.html")
  }

  def scaladocsFile(release: String, file: String) = Action {
    Redirect(scaladocsLocation + "/" + release + "/" + file)
  }

  // Redirect legacy releases URLs (the are too big for free heroku,
  // so I'll put them on Artima for now)
  def releases(zipFile: String) = Action {
    Redirect(releasesLocation + "/" + zipFile)
  }
}
