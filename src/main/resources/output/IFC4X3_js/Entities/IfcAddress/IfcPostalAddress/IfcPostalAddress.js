class IfcPostalAddress extends IfcAddress {
    constructor() {
        /** @type {IFCLABEL} */
        this.InternalLocation = null;
        /** @type {IFCLABEL[]} */
        this.AddressLines = null;
        /** @type {IFCLABEL} */
        this.PostalBox = null;
        /** @type {IFCLABEL} */
        this.Town = null;
        /** @type {IFCLABEL} */
        this.Region = null;
        /** @type {IFCLABEL} */
        this.PostalCode = null;
        /** @type {IFCLABEL} */
        this.Country = null;
    }

    // === WHERE CLAUSES ===
    // WR1 : EXISTS (InternalLocation) OR EXISTS (AddressLines) OR EXISTS (PostalBox) OR EXISTS (PostalCode) OR EXISTS (Town) OR EXISTS (Region) OR EXISTS (Country)
}
