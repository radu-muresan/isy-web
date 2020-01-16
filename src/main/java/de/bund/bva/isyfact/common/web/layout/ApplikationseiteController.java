/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * The Federal Office of Administration (Bundesverwaltungsamt, BVA)
 * licenses this file to you under the Apache License, Version 2.0 (the
 * License). You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package de.bund.bva.isyfact.common.web.layout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;

import de.bund.bva.isyfact.common.web.global.AbstractGuiController;

/**
 * Controller-Klasse fuer Operationen auf dem {@link ApplikationseiteModel}.
 *
 * @author Capgemini, Jonas Zitz
 * @version $Id: ApplikationseiteController.java 123824 2014-10-13 10:05:13Z sdm_ahoerning $
 */
@Controller
public class ApplikationseiteController extends AbstractGuiController<ApplikationseiteModel> {

    /**
     * Der Controller für die Linksnavigation.
     */
    protected LinksnavigationController linksnavigationController;

    /**
     * Der Controller für die Quicklinks.
     */
    protected QuicklinksController quicklinksController;

    @Autowired
    public ApplikationseiteController(LinksnavigationController linksnavigationController, QuicklinksController quicklinksController) {
        this.linksnavigationController = linksnavigationController;
        this.quicklinksController = quicklinksController;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialisiereModel(ApplikationseiteModel model) {
        this.linksnavigationController.initialisiereModel(model);
        this.quicklinksController.initialisiereModel(model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Class<ApplikationseiteModel> getMaskenModelKlasseZuController() {
        return ApplikationseiteModel.class;
    }

    public void setLinksnavigationController(LinksnavigationController linksnavigationController) {
        this.linksnavigationController = linksnavigationController;
    }

    public void setQuicklinksController(QuicklinksController quicklinksController) {
        this.quicklinksController = quicklinksController;
    }

}
