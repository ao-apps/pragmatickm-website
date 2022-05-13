/*
 * pragmatickm-website - The pragmatickm.com website.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
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
module com.pragmatickm.website {
  // Direct
  requires com.pragmatickm.all.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-all-book</artifactId>
  requires com.pragmatickm.bom.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-bom-book</artifactId>
  requires com.pragmatickm.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-book</artifactId>
  requires com.pragmatickm.contact.all.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-all-book</artifactId>
  requires com.pragmatickm.contact.bom.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-bom-book</artifactId>
  requires com.pragmatickm.contact.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-book</artifactId>
  requires com.pragmatickm.contact.model.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-model-book</artifactId>
  requires com.pragmatickm.contact.renderer.html.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-renderer-html-book</artifactId>
  requires com.pragmatickm.contact.servlet.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-servlet-book</artifactId>
  requires com.pragmatickm.contact.style.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-style-book</artifactId>
  requires com.pragmatickm.contact.taglib.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-taglib-book</artifactId>
  requires com.pragmatickm.contact.view.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-contact-view-book</artifactId>
  requires com.pragmatickm.parent.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-parent-book</artifactId>
  requires com.pragmatickm.password.all.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-all-book</artifactId>
  requires com.pragmatickm.password.bom.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-bom-book</artifactId>
  requires com.pragmatickm.password.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-book</artifactId>
  requires com.pragmatickm.password.model.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-model-book</artifactId>
  requires com.pragmatickm.password.renderer.html.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-renderer-html-book</artifactId>
  requires com.pragmatickm.password.servlet.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-servlet-book</artifactId>
  requires com.pragmatickm.password.style.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-style-book</artifactId>
  requires com.pragmatickm.password.taglib.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-taglib-book</artifactId>
  requires com.pragmatickm.password.view.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-view-book</artifactId>
  requires com.pragmatickm.procedure.all.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-all-book</artifactId>
  requires com.pragmatickm.procedure.bom.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-bom-book</artifactId>
  requires com.pragmatickm.procedure.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-book</artifactId>
  requires com.pragmatickm.procedure.model.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-model-book</artifactId>
  requires com.pragmatickm.procedure.renderer.html.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-renderer-html-book</artifactId>
  requires com.pragmatickm.procedure.servlet.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-servlet-book</artifactId>
  requires com.pragmatickm.procedure.style.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-style-book</artifactId>
  requires com.pragmatickm.procedure.taglib.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-taglib-book</artifactId>
  requires com.pragmatickm.procedure.view.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-procedure-view-book</artifactId>
  requires com.pragmatickm.task.all.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-all-book</artifactId>
  requires com.pragmatickm.task.bom.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-bom-book</artifactId>
  requires com.pragmatickm.task.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-book</artifactId>
  requires com.pragmatickm.task.model.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-model-book</artifactId>
  requires com.pragmatickm.task.renderer.html.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-renderer-html-book</artifactId>
  requires com.pragmatickm.task.servlet.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-servlet-book</artifactId>
  requires com.pragmatickm.task.style.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-style-book</artifactId>
  requires com.pragmatickm.task.taglib.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-taglib-book</artifactId>
  requires com.pragmatickm.task.view.book; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-task-view-book</artifactId>
  requires com.semanticcms.core.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-core-all</artifactId>
  requires com.semanticcms.news.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-all</artifactId>
  requires com.semanticcms.section.all; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-section-all</artifactId>
}
