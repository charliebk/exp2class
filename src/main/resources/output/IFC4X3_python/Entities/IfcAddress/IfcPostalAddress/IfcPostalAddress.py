from typing import List

class IfcPostalAddress(IfcAddress):
    def __init__(self):
        self.InternalLocation: IfcLabel = None
        self.AddressLines: List[IfcLabel] = None
        self.PostalBox: IfcLabel = None
        self.Town: IfcLabel = None
        self.Region: IfcLabel = None
        self.PostalCode: IfcLabel = None
        self.Country: IfcLabel = None

    # === WHERE CLAUSES ===
    # WR1 : EXISTS (InternalLocation) OR EXISTS (AddressLines) OR EXISTS (PostalBox) OR EXISTS (PostalCode) OR EXISTS (Town) OR EXISTS (Region) OR EXISTS (Country)
