package org.example;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.*;

public class S3Manager {

    private final S3Client s3 = S3Client.create();

    public void createBucket(String bucketName) {
        try {
            s3.createBucket(CreateBucketRequest.builder().bucket(bucketName).build());
            System.out.println("Bucket créé : " + bucketName);
        } catch (S3Exception e) {
            System.err.println("Erreur lors de la création du bucket : " + e.awsErrorDetails().errorMessage());
        }
    }

    public void deleteBucket(String bucketName) {
        try {
            s3.deleteBucket(DeleteBucketRequest.builder().bucket(bucketName).build());
            System.out.println("Bucket supprimé : " + bucketName);
        } catch (S3Exception e) {
            System.err.println("Erreur lors de la suppression du bucket : " + e.awsErrorDetails().errorMessage());
        }
    }
}