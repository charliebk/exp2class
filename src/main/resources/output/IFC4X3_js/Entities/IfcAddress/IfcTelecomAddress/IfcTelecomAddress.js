class IfcTelecomAddress extends IfcAddress {
    constructor() {
        /** @type {IFCLABEL[]} */
        this.TelephoneNumbers = null;
        /** @type {IFCLABEL[]} */
        this.FacsimileNumbers = null;
        /** @type {IFCLABEL} */
        this.PagerNumber = null;
        /** @type {IFCLABEL[]} */
        this.ElectronicMailAddresses = null;
        /** @type {IFCURIREFERENCE} */
        this.WWWHomePageURL = null;
        /** @type {IFCURIREFERENCE[]} */
        this.MessagingIDs = null;
    }

    // === WHERE CLAUSES ===
    // MinimumDataProvided : EXISTS (TelephoneNumbers) OR EXISTS (FacsimileNumbers) OR EXISTS (PagerNumber) OR EXISTS (ElectronicMailAddresses) OR EXISTS (WWWHomePageURL) OR EXISTS (MessagingIDs)
}
