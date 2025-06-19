from typing import List

class IfcTelecomAddress(IfcAddress):
    def __init__(self):
        self.TelephoneNumbers: List[IfcLabel] = None
        self.FacsimileNumbers: List[IfcLabel] = None
        self.PagerNumber: IfcLabel = None
        self.ElectronicMailAddresses: List[IfcLabel] = None
        self.WWWHomePageURL: IfcURIReference = None
        self.MessagingIDs: List[IfcURIReference] = None

    # === WHERE CLAUSES ===
    # MinimumDataProvided : EXISTS (TelephoneNumbers) OR EXISTS (FacsimileNumbers) OR EXISTS (PagerNumber) OR EXISTS (ElectronicMailAddresses) OR EXISTS (WWWHomePageURL) OR EXISTS (MessagingIDs)
