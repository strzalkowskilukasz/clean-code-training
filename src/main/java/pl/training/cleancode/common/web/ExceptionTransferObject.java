package pl.training.cleancode.common.web;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class ExceptionTransferObject {

    @NonNull
    private String description;

}
