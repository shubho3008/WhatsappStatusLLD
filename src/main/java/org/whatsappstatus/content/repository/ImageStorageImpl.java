package org.whatsappstatus.content.repository;

import org.whatsappstatus.content.entities.ContentEntity;
import org.whatsappstatus.content.models.UploadPtr;

public class ImageStorageImpl implements Storage {
    @Override
    public UploadPtr upload(ContentEntity contentEntityRequest, String userName) {
        return new UploadPtr("DummyPtr");
    }
}
