/*
 * Copyright 2010-2013, CloudBees Inc.
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
package org.springframework.samples.petclinic.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * See http://docs.loader.io/tests/verifying.html#http
 *
 * @author <a href="mailto:cleclerc@cloudbees.com">Cyrille Le Clerc</a>
 */
@Controller
public class LoaderIoController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Sample {code loaderio-d42c8c0e1e87fe70639477caf5dfd8b5}
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = {"/loaderio-{code}.html", "/loaderio-{code}.txt"}, method = RequestMethod.GET)
    public void serveVerificationPage(@PathVariable String code, HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.info("Verified loader.io code '" + code + "'");
        response.getWriter().println("loaderio-" + code);
    }
}
