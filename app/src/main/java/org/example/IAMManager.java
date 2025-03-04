package org.example;
import software.amazon.awssdk.services.iam.IamClient;
import software.amazon.awssdk.services.iam.model.*;
import software.amazon.awssdk.regions.Region;

public class IAMManager {

    private final IamClient iam = IamClient.builder().region(Region.AWS_GLOBAL) // Ou la région selon ton besoin
            .build();


    public void createUser(String userName) {
        try {
            iam.createUser(CreateUserRequest.builder().userName(userName).build());
            System.out.println("Utilisateur IAM créé : " + userName);
        } catch (IamException e) {
            System.err.println("Erreur lors de la création de l'utilisateur : " + e.awsErrorDetails().errorMessage());
        }
    }

    public void deleteUser(String userName) {
        try {
            iam.deleteUser(DeleteUserRequest.builder().userName(userName).build());
            System.out.println("Utilisateur IAM supprimé : " + userName);
        } catch (IamException e) {
            System.err.println("Erreur lors de la suppression de l'utilisateur : " + e.awsErrorDetails().errorMessage());
        }
    }
}
